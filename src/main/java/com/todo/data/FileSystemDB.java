package com.todo.data;

import com.todo.Controller.Controller;
import com.todo.model.Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
        try {
            File datastore = new File("data_store/tasks.json");
            datastore.createNewFile();

            FileWriter fileWriter = new FileWriter("data_store/tasks.json");
            fileWriter.write(this.controller.getInterfaceObserver().getTask().toString());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // TODO : Append the new task to the file
        // TODO : Close file

    }
}
