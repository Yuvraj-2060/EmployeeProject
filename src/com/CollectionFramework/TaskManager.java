package com.CollectionFramework;

import com.CollectionFramework.model.ToDo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskManager {

    Queue<ToDo> taskQueue;
    Stack<ToDo> completedTask;

    public TaskManager(){
        this.taskQueue = new LinkedList<>();
        this.completedTask = new Stack<>();
    }

    public void addNewTask(ToDo task){
        taskQueue.offer(task);
        System.out.println("Task Added : "+task);
    }

    public void processTasks(){
        while (!taskQueue.isEmpty()){
            ToDo task = taskQueue.poll();
            System.out.println("Processing Task : "+task.description());
            ToDo completed = completedTask.push(new ToDo(task.description(), task.duration(),"Completed"));
            System.out.println("Task Completed : "+completed);
        }
    }

    public void showCompletedTask(){
        System.out.println("Completed Tasks : ");
        for (ToDo task:completedTask){
            System.out.println(task);
        }
    }


    public static void main(String[] args) {
        TaskManager toDoManager = new TaskManager();
        toDoManager.addNewTask(new ToDo("Jogging",15));
        toDoManager.addNewTask(new ToDo("Reading",20));
        toDoManager.addNewTask(new ToDo("Coding",450));
        toDoManager.addNewTask(new ToDo("Cooking",10));

        toDoManager.processTasks();

        toDoManager.showCompletedTask();

    }

}