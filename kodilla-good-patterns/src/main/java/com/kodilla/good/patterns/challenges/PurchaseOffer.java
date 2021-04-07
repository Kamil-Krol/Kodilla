package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PurchaseOffer {
    public User user;
    public LocalDateTime transactionTime;

    public PurchaseOffer(final User user, final LocalDateTime transactionTime) {
        this.user = user;
        this.transactionTime = transactionTime;
    }
    public User getUser() {
        return user;
    }
    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }
}
