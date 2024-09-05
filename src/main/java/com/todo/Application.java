package com.todo;

import com.todo.Controller.ControllerFactory;
import com.todo.Controller.ControllerFactoryMaker;
import com.todo.view.*;

public class Application {
    public static void main(String[] args) {

        ConsoleStateFactory consoleStateFactory = new ConsoleStateMaker();
        MenuConsole menuConsole = new MenuConsole(consoleStateFactory);
        Interface console = new Console(new MenuConsoleDecorator(
                menuConsole, consoleStateFactory
        ));

        ControllerFactory controllerFactory = new ControllerFactoryMaker();
        InterfaceObserver consoleObserver = new IOHandler(console, controllerFactory);

        menuConsole.setConsole((Console) console);
        menuConsole.setInterfaceObserver(consoleObserver);

        ((Console)console).setInterfaceObserver(consoleObserver);
        ((Console)console).getConsoleState().setConsole((Console) console);

        while (true){
            console.show();
        }
    }
}