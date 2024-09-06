package com.todo.Controller;

import com.todo.data.DataStore;
import com.todo.view.InterfaceObserver;

public abstract class Controller {

    protected InterfaceObserver interfaceObserver;
    protected DataStore dataStore;

    public Controller(InterfaceObserver interfaceObserver) {
        this.interfaceObserver = interfaceObserver;
    }

    public Controller(InterfaceObserver interfaceObserver, DataStore dataStore) {
        this.interfaceObserver = interfaceObserver;
        this.dataStore = dataStore;
    }

    public abstract void action();

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }
}
