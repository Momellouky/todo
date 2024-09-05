package com.todo.Controller;

import com.todo.view.ConsoleState;

public class ControllerFactoryMaker implements ControllerFactory {
    @Override
    public Controller Instantiate(ConsoleState consoleState) throws Exception{
        if(consoleState.toString().equals("AddTaskConsole")){
            return new AddTaskController();
        }
        else if(consoleState.toString().equals("ListTasksMenuConsole")) {
            return new ShowTodoTasksController();
        }
        throw new Exception("The consoleState object does not match any valid console state");
    }
}
