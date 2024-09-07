package com.todo.data;

import com.todo.Controller.Controller;
import com.todo.model.Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileSystemDB extends DataStore{

    protected static FileSystemDB instance ;
    protected final String DEFAULT_DATA_STORE_PATH = "./data_store/";

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

        // TODO : check if data_store dir exists
        // TODO : if not create it
        // TODO : APPEND the file the task
        try {

            boolean datastoreCreated = false;

            if(Files.exists(Path.of(DEFAULT_DATA_STORE_PATH))){
                System.out.println("Directory found...");
            }else{
                // Create the directory
                datastoreCreated = new File("./data_store/").mkdirs();
            }

            File tasksFile = new File(DEFAULT_DATA_STORE_PATH + "tasks.json");
            if(!tasksFile.exists() && tasksFile.isFile()){
                tasksFile.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(tasksFile, true);

            fileWriter.write(this.controller.getInterfaceObserver().getTask().toString() + "\n");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
