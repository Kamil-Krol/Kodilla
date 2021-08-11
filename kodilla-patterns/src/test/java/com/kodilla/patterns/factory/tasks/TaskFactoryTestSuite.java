package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testDrivingTask()
    {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.createTask(TaskFactory.DRIVING);

        //Then
        assertEquals("Driving", driving.getTaskName());

    }

    @Test
    void testPaintingTask()
    {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.createTask(TaskFactory.PAINTING);

        //Then
        assertEquals("Painting", painting.getTaskName());


    }

    @Test
    void testShoppingTask()
    {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.createTask(TaskFactory.SHOPPING);

        //Then
        assertEquals("Shopping", shopping.getTaskName());


    }
}
