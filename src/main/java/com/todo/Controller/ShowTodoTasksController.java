package com.todo.Controller;

import com.todo.data.DataStore;
import com.todo.view.InterfaceObserver;

public class ShowTodoTasksController extends Controller {

    public ShowTodoTasksController(InterfaceObserver interfaceObserver) {
        super(interfaceObserver);
    }

    public ShowTodoTasksController(InterfaceObserver interfaceObserver, DataStore dataStore) {
        super(interfaceObserver, dataStore);
    }

    @Override
    public void action() {

        // TODO : say to the observer i want data

        // TODO : print the data on the screen

        System.out.println("ShowTodoTasksController action. Fetching tasks from the disk");

    }
}
