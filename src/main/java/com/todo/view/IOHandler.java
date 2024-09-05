package com.todo.view;

import com.todo.Controller.Controller;
import com.todo.Controller.ControllerFactory;

public class IOHandler extends InterfaceObserver{

    public IOHandler(Interface userInterface){
        this.observableInterface = userInterface;
    }

    public IOHandler(Interface useInterface, ControllerFactory controllerFactory){
        this.observableInterface = useInterface;
        this.controllerFactory = controllerFactory;
    }

    @Override
    public void handle() {

        // TODO : receive the task

        // TODO : send the task to the controller

    }
}
