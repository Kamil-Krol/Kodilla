package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create empty List, " +
            "then exterminate should return empty List"
    )
    @Test
    public void  testOddNumbersExterminatorEmptyList()
    {
        List<Integer> numbers = new LinkedList<>();
        //Given
        OddNumbersExterminator evenNumbers = new OddNumbersExterminator(numbers);
        //When
        List<Integer> evens = evenNumbers.exterminate(numbers);

        //Then
        Assertions.assertEquals(numbers,evens);
    }

    @DisplayName("when create normal List, " +
            "then exterminate should return  List without odd numbers"
    )
    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> numbers = new LinkedList<>();
        int sizeOfList = 100;
        Random rand = new Random();
        for (int i = 0; i < sizeOfList; i++) {
            int number = rand.nextInt(20);
            numbers.add(number);
        }

        //Given
        OddNumbersExterminator evenNumbers = new OddNumbersExterminator(numbers);
        //When
        List<Integer> evens = evenNumbers.exterminate(numbers);
        //Then
        Assertions.assertNotEquals(numbers, evens);
    }
    @DisplayName("when create array as list, " +
            "then exterminate should return  List without odd numbers")
    @Test
    public void testOddNumbersExterminatorArrayAsList() {
        List<Integer> numbers = Arrays.asList(2, 7, 4, 8, 4, 1, 4, 6, 7, 0, 6, 5);

        //Given
        OddNumbersExterminator evenNumbers = new OddNumbersExterminator(numbers);
        //When
        List<Integer> evens = evenNumbers.exterminate(numbers);
        //Then
        Assertions.assertNotEquals(numbers, evens);
    }
}
