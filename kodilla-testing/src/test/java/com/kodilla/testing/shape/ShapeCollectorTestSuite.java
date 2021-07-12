package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



@Nested
@DisplayName("Test for shape collector")
public class ShapeCollectorTestSuite {
    //Given
    Circle circle = new Circle();
    Square square = new Square();
    ShapeCollector shapeCollector = new ShapeCollector();

    @Test
    void testAddFigure()
    {
        //Given

        //When
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    void testRemoveFigure()
    {
        //Given
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assertions.assertEquals(0,shapeCollector.getSizeOfTheList());
    }

    @Test
    void testGetFigure()
    {
        //Given
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    void testShowFigures()
    {
        //Given
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.showFigures();
        //Then
        Assertions.assertEquals(2, shapeCollector.getSizeOfTheList());
    }

}