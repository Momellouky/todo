package com.todo.Controller;

import com.todo.view.ConsoleState;
import com.todo.view.InterfaceObserver;

public interface ControllerFactory {

    Controller Instantiate(ConsoleState consoleState, InterfaceObserver interfaceObserver) throws Exception;

}
