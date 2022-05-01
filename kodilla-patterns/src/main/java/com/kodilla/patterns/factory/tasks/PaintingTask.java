package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecute = false;

   public PaintingTask(final String taskName, final String color, final String whatToPaint) {
       this.taskName = taskName;
       this.color = color;
       this.whatToPaint = whatToPaint;
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
