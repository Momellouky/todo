package com.todo.Controller;

import com.todo.data.DataStore;
import com.todo.data.FileSystemDB;
import com.todo.view.InterfaceObserver;

public class AddTaskController extends Controller{

    public AddTaskController(InterfaceObserver interfaceObserver) {
        super(interfaceObserver);
    }

    public AddTaskController(InterfaceObserver interfaceObserver, DataStore dataStore) {
        super(interfaceObserver, dataStore);
    }

    @Override
    public void action() {

        // TODO : get the data from the this.interfaceObserver object, process it,
        //      interfaceObserver

//        System.out.println("AddTaskController action method. Saving task on the disk");
        this.setDataStore(FileSystemDB.getInstance(this));
        this.dataStore.save(this.interfaceObserver.getTask());
    }
}
