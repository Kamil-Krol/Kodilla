package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage()
    {
        //Given
        int[] tab = {3,4,6,7,5,3,2,6,9,0,-2,-5};

        //When
        getAverage(tab);

        //Then

    }
}
