package com.todo.view;

public interface ConsoleStateFactory {

    ConsoleState Instantiate(String userInput, Interface console) throws Exception;

}
