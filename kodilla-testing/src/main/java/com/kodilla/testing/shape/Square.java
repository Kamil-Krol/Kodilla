package com.kodilla.testing.shape;

public class Square implements Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public String getShapeName()
    {

        String name = "Square";
        return name;
    }

    public double getField()
    {
        return side * side;
    }


}
