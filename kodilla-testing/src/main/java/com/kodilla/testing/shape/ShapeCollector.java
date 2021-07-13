package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ShapeCollector {
    private List<Shape> list = new ArrayList<>();



    public void addFigure(Shape shape)
    {

        list.add(shape);

    }

    public void removeFigure(Shape shape)
    {

        list.remove(shape);
    }

    public Shape getFigure(int n)
    {
        return list.get(n);
    }

    public int getSizeOfTheList()
    {
        return list.size();
    }

    public String showFigures()
    {

        String names = list.stream().map(e -> e.getShapeName()).collect(Collectors.joining(", "));
           return names;
    }


}
