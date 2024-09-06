package com.todo.Controller;

import com.todo.data.DataStore;
import com.todo.view.InterfaceObserver;

public class MenuController extends Controller{

    public MenuController(InterfaceObserver interfaceObserver) {
        super(interfaceObserver);
    }

    public MenuController(InterfaceObserver interfaceObserver, DataStore dataStore) {
        super(interfaceObserver, dataStore);
    }

    @Override
    public void action() {

        // TODO : Basically there isn't much to do. This class should be revised

        System.out.println("MenuController action method");

    }
}
