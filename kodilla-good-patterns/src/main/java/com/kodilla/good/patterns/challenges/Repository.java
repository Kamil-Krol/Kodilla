package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface Repository {
    public default void sell(User user, LocalDateTime transactionTime)
    {
        System.out.println(user + " " + transactionTime);
    }
}
