package com.todo.utils;

public enum TaskPriority {

    RED("RED"),
    YELLOW("YELLOW"),
    GREEN("GREEN");

    protected String taskPriority;

    TaskPriority(String taskPriority){
        this.taskPriority = taskPriority;
    }

    @Override
    public String toString(){
        return this.taskPriority;
    }



}
