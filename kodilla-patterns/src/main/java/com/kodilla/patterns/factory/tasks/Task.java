package com.kodilla.patterns.factory.tasks;

public interface Task {

    TaskDto executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
