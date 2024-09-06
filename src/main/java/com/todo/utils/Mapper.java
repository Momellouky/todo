package com.todo.utils;

public class Mapper {

    public static TaskPriority priorityMap(String priority) throws Exception {

        if(!priority.isEmpty()){
            if(priority.equals("RED")){
                return TaskPriority.RED;
            }
            else if(priority.equals("YELLOW")){
                return TaskPriority.YELLOW;
            }
            else if(priority.equals("GREEN")){
                return TaskPriority.GREEN;
            }
        }

        throw new Exception("The priority string is empty or does not match one of these values : [RED, YELLOW, GREEN]");

    }

    public static TaskStatus statusMap(String status) throws Exception {

        if(!status.isEmpty()){
            if(status.equals("TODO")){
                return TaskStatus.TO_DO;
            }
            else if(status.equals("DOING")){
                return TaskStatus.DOING;
            }
            else if(status.equals("DONE")){
                return TaskStatus.DONE;
            }
        }

        throw new Exception("The priority string is empty or does not match one of these values : [TODO, DOING, DONE]");

    }

}