package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    public void update(TaskQueue taskQueue) {
        System.out.println("New task on task queue: " + taskQueue.getTaskDeque().getLast().getName() + "\n" +
                " (total " + taskQueue.getTaskDeque().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
