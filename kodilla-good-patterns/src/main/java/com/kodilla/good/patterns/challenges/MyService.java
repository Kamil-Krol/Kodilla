package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class MyService implements Service{
    public boolean sell(User user, LocalDateTime transactionTime, Product product, boolean isAvailable) {
        System.out.println("You bought " + product);
        return isAvailable;
    }
}
