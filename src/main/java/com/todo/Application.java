package com.todo;

import com.todo.view.*;

public class Application {
    public static void main(String[] args) {

        ConsoleStateFactory consoleStateFactory = new ConsoleStateMaker();
        MenuConsole menuConsole = new MenuConsole(consoleStateFactory);
        Interface console = new Console(new MenuConsoleDecorator(
                menuConsole, consoleStateFactory
        ));
//        menuConsole.setConsole((Console) console);

        ((Console)console).getConsoleState().setConsole((Console) console);
        while (true){
            console.show();
        }
    }
}