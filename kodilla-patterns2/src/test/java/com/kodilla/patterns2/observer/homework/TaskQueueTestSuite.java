package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        // Given
        TaskQueue MarkQueue = new TaskQueue("Mark Gibonn");
        TaskQueue AnnaQueue = new TaskQueue("Anna Toczek");
        TaskQueue JohnQueue = new TaskQueue("John Spencer");
        Mentor pablo = new Mentor("Pablo Escobar");
        Mentor jasmine = new Mentor("Jasmine Johns");
        Task task1 = new Task("task no 1");
        Task task5 = new Task("task no 5");
        Task task3 = new Task("task no 3");
        Task task6 = new Task("task no 6");

        //When
        MarkQueue.registerObserver(pablo);
        AnnaQueue.registerObserver(pablo);
        JohnQueue.registerObserver(jasmine);
        MarkQueue.addTask(task1);
        MarkQueue.addTask(task5);
        AnnaQueue.addTask(task5);
        AnnaQueue.addTask(task3);
        AnnaQueue.addTask(task6);
        JohnQueue.addTask(task6);

        //Then
        assertEquals(5, pablo.getUpdateCount());
        assertEquals(1, jasmine.getUpdateCount());
    }
}
