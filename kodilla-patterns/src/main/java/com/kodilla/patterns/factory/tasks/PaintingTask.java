package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private TaskDto taskDto;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public TaskDto executeTask()
    {
        taskDto = new TaskDto(new PaintingTask(taskName,color,whatToPaint),true);
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
