package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage()
    {
        //Given
        int[] tab = {2,3};

        //When
        double result = getAverage(tab);

        //Then
        assertEquals(2.5, result);
    }
}
