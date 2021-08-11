package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String taskType) {
        switch (taskType) {
            case DRIVING:
                return new DrivingTask("Driving","anywhere","car");
            case PAINTING:
                return new PaintingTask("Painting","blue","wall");
            case SHOPPING:
                return new ShoppingTask("Shopping","t-shirt",1);
            default:
                return null;
        }

    }
}
