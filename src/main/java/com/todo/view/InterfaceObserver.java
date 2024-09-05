package com.todo.view;

import com.todo.model.Task;

public abstract class InterfaceObserver {

    // TODO : declare a controller instance
    // TODO : declare a Controller Factory Instance

    protected Interface observableInterface;
    protected Task task;

    public abstract void handle();

    public void setTask(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }
}
