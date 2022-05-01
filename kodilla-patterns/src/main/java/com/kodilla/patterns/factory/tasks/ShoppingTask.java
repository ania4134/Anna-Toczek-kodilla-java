package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isExecute = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
