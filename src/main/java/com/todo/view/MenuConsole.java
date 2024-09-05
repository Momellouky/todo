package com.todo.view;

public class MenuConsole extends ConsoleState{

    protected ConsoleStateFactory consoleStateFactory;

    public MenuConsole(ConsoleStateFactory consoleStateFactory){
        this.consoleStateFactory = consoleStateFactory;
    }

    @Override
    public void show() {

        // TODO : implement the main menu of the application

        System.out.println("A- Add a new task");
        System.out.println("B- List all taks");
        // TODO : System.out.println("C- Mark task as complete");

    }

}
