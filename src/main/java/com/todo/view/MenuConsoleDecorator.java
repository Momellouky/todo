package com.todo.view;

import java.awt.*;
import java.util.Scanner;

public class MenuConsoleDecorator extends MenuConsole{

    protected MenuConsole menuConsole;

    public MenuConsoleDecorator(MenuConsole menuConsole, ConsoleStateFactory consoleStateFactory){
        super(consoleStateFactory);
        this.menuConsole = menuConsole;
    }

    @Override
    public void show(){
        this.menuConsole.show();

        String userInput = getUserInput();
        try {
            ConsoleState nextConsoleState = consoleStateFactory.Instantiate(userInput);
            this.console.setConsoleState(nextConsoleState);
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
