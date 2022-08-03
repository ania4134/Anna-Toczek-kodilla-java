package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskQueue implements Observable {
    private final List<TaskObserver> observers;
    private final Deque<Task> taskDeque;
    private String studentName;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        taskDeque = new ArrayDeque<>();
        this.studentName = name;
    }

    public void addTask(Task task) {
        taskDeque.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(TaskObserver observer : observers)
            observer.update(this);
    }

    @Override
    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public List<TaskObserver> getObservers() {
        return observers;
    }

    public Deque<Task> getTaskDeque() {
        return taskDeque;
    }

    public String getStudentName() {
        return studentName;
    }
}
