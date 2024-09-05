package com.todo.view;

import com.todo.model.Task;
import com.todo.utils.Mapper;

import java.util.Scanner;

public class AddTaskConsoleDecorator extends AddTaskConsole{

    protected AddTaskConsole addTaskConsole;

    public AddTaskConsoleDecorator(AddTaskConsole addTaskConsole, Interface console){
        this.addTaskConsole = addTaskConsole;
        this.addTaskConsole.setConsole((Console) console);
    }

    @Override
    public void show(){
        this.addTaskConsole.show();

        Task userInput = null;
        try {
            userInput = getTask();
            this.interfaceObserver.setTask(userInput);
            // TODO : The user should press the Q button to change the Console state.
            ConsoleStateFactory consoleStateFactory = new ConsoleStateMaker();
//            this.console.setConsoleState(new MenuConsoleDecorator(new MenuConsole(consoleStateFactory), consoleStateFactory));
            this.addTaskConsole.getConsole().setConsoleState(
                    new MenuConsoleDecorator(
                            new MenuConsole(consoleStateFactory), consoleStateFactory, this.addTaskConsole.getConsole())
            );
        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }

        // TODO : send the task to the IOHandler => Done in line 24
        // TODO : change the state of the screen
    }



    protected Task getTask() throws Exception{

        Scanner scanner = new Scanner(System.in);

        System.out.print("task name: ");
        String taskName = scanner.nextLine();

        System.out.print("task description: ");
        String taskDesc = scanner.nextLine();

        System.out.print("task deadline: ");
        String taskDeadline = scanner.nextLine();

        System.out.print("task priority: ");
        String taskPriority = scanner.nextLine();

        System.out.print("task status: ");
        String taskStatus = scanner.nextLine();
        ;
        Task task = new Task(
                taskName, taskDesc, taskDeadline, Mapper.priorityMap(taskPriority), Mapper.statusMap(taskStatus)
        );

        return task;
    }
}
