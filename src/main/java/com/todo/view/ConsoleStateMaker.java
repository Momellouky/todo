package com.todo.view;

public class ConsoleStateMaker implements ConsoleStateFactory{
    @Override
    public ConsoleState Instantiate(String userInput) throws Exception  {
        if(! userInput.isEmpty()){
            if(userInput.toLowerCase().equals("a")){
                return new AddTaskConsole();
            }
            else if(userInput.toLowerCase().equals("b")){
                return new ListTasksMenu();
            }
        }

        // TODO : Create custom exceptions

        throw new Exception("userInput is empty or have unexpected value");
    }
}
