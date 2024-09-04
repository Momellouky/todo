package com.todo.Controller;

import com.todo.view.ConsoleState;

public interface ControllerFactory {

    Controller Instantiate(ConsoleState consoleState);

}
