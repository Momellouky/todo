package com.todo.view;

public class Console extends Interface{

    protected ConsoleState consoleState;

    public Console(ConsoleState consoleState){
        this.consoleState = consoleState;
    }


    @Override
    public void show() {

        // TODO : call the show method of the ConsoleState object

        this.consoleState.show();

    }

    public void setConsoleState(ConsoleState consoleState) {
        this.consoleState = consoleState;
    }

    public ConsoleState getConsoleState() {
        return consoleState;
    }

    public void setInterfaceObserver(InterfaceObserver interfaceObserver){
        this.interfaceObserver = interfaceObserver;
    }

    public InterfaceObserver getInterfaceObserver(){
        return this.interfaceObserver;
    }
}
