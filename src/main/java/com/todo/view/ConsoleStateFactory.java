package com.todo.view;

public interface ConsoleStateFactory {

    ConsoleState Instantiate(String userInput) throws Exception;

}
