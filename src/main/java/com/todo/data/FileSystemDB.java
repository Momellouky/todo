package com.todo.data;

import com.todo.Controller.Controller;
import com.todo.model.Task;

public class FileSystemDB extends DataStore{

    protected static FileSystemDB instance ;

    private FileSystemDB(Controller controller) {
        super(controller);
    }

    public static FileSystemDB getInstance(Controller controller){
        if(instance == null){
            instance = new FileSystemDB(controller);
        }
        return instance;
    }

    @Override
    public void save(Task task) {
        System.out.println("FileSystemDB... Saving Task into file");

        // TODO : Create file if not exists
        // TODO : Append the new task to the file
        // TODO : Close file

    }
}
