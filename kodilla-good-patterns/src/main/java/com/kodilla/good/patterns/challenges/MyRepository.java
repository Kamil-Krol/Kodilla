package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public class MyRepository implements Repository{
    public void soldProducts(User user, Product product, LocalDateTime transactionTime) {
        System.out.println("Product: " + product + " added to repository");
    }
}
