package com.todo.Controller;

import com.todo.view.InterfaceObserver;

public abstract class Controller {

    protected InterfaceObserver interfaceObserver;

    public abstract void action();

}
