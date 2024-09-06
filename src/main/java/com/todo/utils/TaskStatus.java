package com.todo.utils;

public enum TaskStatus {

    TO_DO("TODO"),
    DOING("DOING"),
    DONE("DONE");

    protected String taskStatus;

    TaskStatus(String taskStatus){
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString(){
        return this.taskStatus;
    }

}
