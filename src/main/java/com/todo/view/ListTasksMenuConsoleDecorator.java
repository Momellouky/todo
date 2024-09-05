package com.todo.view;

import com.todo.model.Task;
import com.todo.utils.Mapper;

import java.util.Scanner;

public class ListTasksMenuConsoleDecorator extends AddTaskConsole{

    protected ListTasksMenuConsole listTasksMenuConsole;

    public ListTasksMenuConsoleDecorator(ListTasksMenuConsole listTasksMenuConsole, Interface console){
        this.listTasksMenuConsole = listTasksMenuConsole;
        this.listTasksMenuConsole.setConsole((Console) console);
    }

    @Override
    public void show(){
        this.listTasksMenuConsole.show();

        Task userInput = null;
        try {
//            userInput = getListTasks();
            // TODO : The user should press the Q button to change the Console state.
            ConsoleStateFactory consoleStateFactory = new ConsoleStateMaker();
//            this.console.setConsoleState(new MenuConsoleDecorator(new MenuConsole(consoleStateFactory), consoleStateFactory));
            this.listTasksMenuConsole.getConsole().setConsoleState(
                    new MenuConsoleDecorator(
                            new MenuConsole(consoleStateFactory), consoleStateFactory, this.addTaskConsole.getConsole())
            );
        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void getListTasks(){

        // TODO : get the list of tasks from the controller
        // TODO : change the method signature. It must return a list of tasks

    }

}
