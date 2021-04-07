package com.kodilla.good.patterns.challenges;

public interface InformationService {
    default void inform(User user)
    {
        System.out.println("Successful transaction");
    }
}
