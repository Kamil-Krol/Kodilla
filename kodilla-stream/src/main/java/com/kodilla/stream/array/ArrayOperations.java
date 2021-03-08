package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers)
    {
        IntStream streamFromArray = Arrays.stream(numbers);
         IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(n));
         return 7.7;
//         return IntStream.range(0, numbers.length)
//                 .forEach(System.out::println);

    }
}