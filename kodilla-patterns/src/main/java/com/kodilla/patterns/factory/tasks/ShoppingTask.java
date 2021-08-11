package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private TaskDto taskDto;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public TaskDto executeTask()
    {
         taskDto = new TaskDto(new ShoppingTask(taskName,whatToBuy,quantity),true);
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
