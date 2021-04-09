package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface Repository {
     void soldProducts(User user, Product product, LocalDateTime transactionTime);
}
