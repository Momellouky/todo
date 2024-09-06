package com.todo.data;

import com.todo.Controller.Controller;
import com.todo.model.Task;

public abstract class DataStore {

    Controller controller ;

    public DataStore(Controller controller){
        this.controller = controller;
    }

    public abstract void save(Task task);

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
