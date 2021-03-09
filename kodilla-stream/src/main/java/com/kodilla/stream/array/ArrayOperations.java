package com.kodilla.stream.array;


import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers)
    {

        IntStream.range(0, numbers.length)
                .map(index->numbers[index])
                .forEach(s-> System.out.println(s));

         double result = IntStream.range(0, numbers.length)
                 .map(index->numbers[index])
                 .average().getAsDouble();
         return result;

        /*IntStream.of(numbers)
        .forEach(n-> System.out.println(n));

        return IntStream.of(numbers)
                .average().getAsDouble();*/





    }
}