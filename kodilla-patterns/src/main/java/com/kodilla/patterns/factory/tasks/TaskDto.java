package com.kodilla.patterns.factory.tasks;

public class TaskDto {
    private final Task task;
    private final boolean isExecuted;

    public TaskDto(Task task, boolean isExecuted) {
        this.task = task;
        this.isExecuted = isExecuted;
    }

    public Task getTask() {
        return task;
    }

    public boolean isExecuted() {
        return isExecuted;
    }
}
