package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);

        //Then
        Assertions.assertEquals("Tesco Shopping", shoppingTask.getTaskName());
        Assertions.assertFalse(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();

        //Then
        Assertions.assertEquals("Driving task nr 3", drivingTask.getTaskName());
        Assertions.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();

        //Then
        Assertions.assertEquals("Home painting", paintingTask.getTaskName());
        Assertions.assertTrue(paintingTask.isTaskExecuted());
    }
}
