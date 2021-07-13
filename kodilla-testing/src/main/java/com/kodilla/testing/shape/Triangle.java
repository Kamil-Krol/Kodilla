package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double side, height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public String getShapeName()
    {

        String name = "Triangle";
        return name;
    }


    public double getField()
    {
        return 0.5 * side * height;
    }
}
