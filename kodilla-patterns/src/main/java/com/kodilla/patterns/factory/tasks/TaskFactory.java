package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Driving task nr 3", "Paris", "Honda Civic");
            case PAINTING_TASK:
                return new PaintingTask("Home painting", "red & white", "Dining room");
            case SHOPPING_TASK:
                return new ShoppingTask("Tesco Shopping", "whole milk [bottle]", 3.0);
            default:
                return null;
        }
    }
}
