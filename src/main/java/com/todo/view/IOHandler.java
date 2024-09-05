package com.todo.view;

public class IOHandler extends InterfaceObserver{

    public IOHandler(Interface userInterface){
        this.observableInterface = userInterface;
    }

    @Override
    public void handle() {

        // TODO : receive the task
        // TODO : send the task to the controller

    }
}
