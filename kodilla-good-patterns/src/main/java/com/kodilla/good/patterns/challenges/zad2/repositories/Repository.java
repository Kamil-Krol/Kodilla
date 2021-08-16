package com.kodilla.good.patterns.challenges.zad2.repositories;

import com.kodilla.good.patterns.challenges.zad2.domain.Product;
import com.kodilla.good.patterns.challenges.zad2.domain.User;

import java.time.LocalDateTime;

public interface Repository {
     void soldProducts(User user, Product product, LocalDateTime transactionTime);
}
