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
        int[] tab = {2,4,6,8,4,3,5,6,7,9,-2,-4};

        //When
        double result = getAverage(tab);

        //Then
        assertEquals(4, result);
    }
}
