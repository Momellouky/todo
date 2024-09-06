package com.todo.view;

public abstract class ConsoleState extends Interface{

    protected Console console;

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;

    }

    public void setInterfaceObserver(InterfaceObserver interfaceObserver){
        this.interfaceObserver = interfaceObserver;
    }

}
