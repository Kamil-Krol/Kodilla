package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private TaskDto taskDto;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public TaskDto executeTask()
    {
        taskDto = new TaskDto(new DrivingTask(taskName,where,using),true);
        return taskDto;
    }

    public String getTaskName()
    {
        return taskName;
    }

    public boolean isTaskExecuted()
    {
        return taskDto.isExecuted();
    }
}
