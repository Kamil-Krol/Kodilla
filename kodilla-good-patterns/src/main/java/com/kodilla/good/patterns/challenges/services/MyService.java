package com.kodilla.good.patterns.challenges.services;

import com.kodilla.good.patterns.challenges.domain.Product;
import com.kodilla.good.patterns.challenges.domain.User;

import java.time.LocalDateTime;

public class MyService implements Service{
    public boolean sell(User user, LocalDateTime transactionTime, Product product, boolean isAvailable) {
        System.out.println("You bought " + product);
        return isAvailable;
    }
}
