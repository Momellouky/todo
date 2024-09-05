package com.todo.view;

public class ConsoleStateMaker implements ConsoleStateFactory{
    @Override
    public ConsoleState Instantiate(String userInput, Interface console) throws Exception  {
        if(! userInput.isEmpty()){
            if(userInput.toLowerCase().equals("a")){
                ConsoleState addTaskConsole = new AddTaskConsoleDecorator(new AddTaskConsole(), (Console)console);
                return addTaskConsole;
            }
            else if(userInput.toLowerCase().equals("b")){
                ConsoleState listTasksConsole = new ListTasksMenuConsoleDecorator(
                        new ListTasksMenuConsole(), (Console) console
                );
//                return new ListTasksMenuConsole();
                return listTasksConsole;
            }
            else if(userInput.toLowerCase().equals("q")){
//                ConsoleStateFactory consoleStateFactory = new ConsoleStateMaker();
//                MenuConsole menuConsole = new MenuConsole(consoleStateFactory);
//                MenuConsoleDecorator menuConsoleDecorator = new MenuConsoleDecorator(
//                    menuConsole, consoleStateFactory, (Console) console
//                );
////                return new MenuConsole(consoleStateFactory);
//                return menuConsoleDecorator;
                System.exit(0);
            }
        }

        // TODO : Create custom exceptions

        throw new Exception("userInput is empty or have unexpected value");
    }
}
