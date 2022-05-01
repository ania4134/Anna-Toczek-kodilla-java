package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecute = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName);
        isExecute = true;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean result = false;
        if (isExecute == true) {
            result = true;
            System.out.println("Task is executed.\n");
        } else
            System.out.println("The task " + taskName +" was not completed.\n");
        return result;
    }
}
