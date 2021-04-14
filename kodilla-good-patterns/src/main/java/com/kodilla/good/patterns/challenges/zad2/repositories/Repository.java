package com.kodilla.good.patterns.challenges.repositories;

import com.kodilla.good.patterns.challenges.domain.Product;
import com.kodilla.good.patterns.challenges.domain.User;

import java.time.LocalDateTime;

public interface Repository {
     void soldProducts(User user, Product product, LocalDateTime transactionTime);
}
