package com.kodilla.good.patterns.challenges.zad2.repositories;

import com.kodilla.good.patterns.challenges.zad2.domain.Product;
import com.kodilla.good.patterns.challenges.zad2.domain.User;

import java.time.LocalDateTime;

public class MyRepository implements Repository {
    public void soldProducts(User user, Product product, LocalDateTime transactionTime) {
        System.out.println("Product: " + product + " added to repository");
    }
}
