package com.todo.view;

public class IOHandler extends InterfaceObserver{

    public IOHandler(Interface userInterface){
        this.observableInterface = userInterface;
    }

    @Override
    public void update() {
        System.out.println("I/O Handler");
    }
}
