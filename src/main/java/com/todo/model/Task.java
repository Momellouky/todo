package com.todo.model;

import com.todo.utils.TaskPriority;
import com.todo.utils.TaskStatus;

public class Task {

    protected String name;
    protected String description;
    protected String deadline;
    protected TaskPriority priority;
    protected TaskStatus status;


    public Task(String name, String deadline, TaskPriority priority, TaskStatus status) {
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
        this.status = status;
    }

    public Task(String name, String description, String deadline, TaskPriority priority, TaskStatus status) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name:'" + name + '\'' +
                ", description:'" + description + '\'' +
                ", deadline:'" + deadline + '\'' +
                ", priority:" + priority +
                ", status:" + status +
                '}';
    }
}
