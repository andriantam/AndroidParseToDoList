package com.revivalx.androidparsetodolist.model;

/**
 * Created by MNurdin on 6/10/15.
 */
public class Task {

    public String taskId;
    public String name;
    public String description;

    public Task(String taskId, String name, String description) {
        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    public Task(){
        this.taskId = "";
        this.name = "";
        this.description = "";
    }

    public void setTaskId(String taskId){
        this.taskId = taskId;
    }

    public String getTaskId(){
        return taskId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}