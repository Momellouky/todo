package com.todo.Controller;

import com.todo.view.ConsoleState;
import com.todo.view.InterfaceObserver;

public class ControllerFactoryMaker implements ControllerFactory {
    @Override
    public Controller Instantiate(ConsoleState consoleState, InterfaceObserver interfaceObserver) throws Exception{
        if(consoleState.toString().equals("AddTaskConsole")){
            return new AddTaskController(interfaceObserver);
        }
        else if(consoleState.toString().equals("ListTasksMenuConsole")) {
            return new ShowTodoTasksController(interfaceObserver);
        }
        throw new Exception("The consoleState object does not match any valid console state");
    }
}
