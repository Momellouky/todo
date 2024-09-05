package com.todo.view;

import java.awt.*;
import java.util.Scanner;

public class MenuConsoleDecorator extends MenuConsole{

    protected MenuConsole menuConsole;

    public MenuConsoleDecorator(MenuConsole menuConsole, ConsoleStateFactory consoleStateFactory){
        super(consoleStateFactory);
        this.menuConsole = menuConsole;
    }

    public MenuConsoleDecorator(MenuConsole menuConsole, ConsoleStateFactory consoleStateFactory, Interface console){
        super(consoleStateFactory);
        this.menuConsole = menuConsole;
        this.menuConsole.setConsole((Console) console);
    }

    @Override
    public void show(){
        this.menuConsole.show();

        String userInput = getUserInput();
        try {
            ConsoleState nextConsoleState = consoleStateFactory.Instantiate(userInput, this.menuConsole.getConsole());
            this.interfaceObserver = this.menuConsole.getConsole().getInterfaceObserver();
            nextConsoleState.setInterfaceObserver(this.interfaceObserver);
//            this.console.setInterfaceObserver(this.interfaceObserver);
//            this.console.setConsoleState(nextConsoleState);
            this.menuConsole.getConsole().setInterfaceObserver(this.interfaceObserver);
            this.menuConsole.getConsole().setConsoleState(nextConsoleState);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected String getUserInput(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");

        return scanner.nextLine();


    }
}
