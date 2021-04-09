package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface Service {
     boolean sell(User user, LocalDateTime transactionTime,Product product, boolean available);
}
