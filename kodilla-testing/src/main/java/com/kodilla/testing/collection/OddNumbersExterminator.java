package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> numbers= new LinkedList<>();


    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate(List<Integer> numbers)
    {
        List<Integer> evens = new LinkedList<>();
        for (Integer number : numbers)
        {

            if (number%2==0)
            {
                evens.add(number);
            }

        }

        return evens;
    }
}
