package com.kodilla.good.patterns.challenges.zad2.services;

import com.kodilla.good.patterns.challenges.zad2.domain.Product;
import com.kodilla.good.patterns.challenges.zad2.domain.User;

import java.time.LocalDateTime;

public interface Service {
     boolean sell(User user, LocalDateTime transactionTime, Product product, boolean isAvailable);
}
