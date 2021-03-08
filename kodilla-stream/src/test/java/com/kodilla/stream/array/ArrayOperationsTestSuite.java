package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage()
    {
        //Given
        int[] tab = {3,4,6,7,5,3,2,6,9,0,-2,-5,3,4,6,8,2,3,6,7};

        //When
        double result = getAverage(tab);

        //Then
        assertEquals(7.7, result);
    }
}
