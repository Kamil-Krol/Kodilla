package com.kodilla.good.patterns.challenges.zad2.domain;

import java.time.LocalDateTime;

public class BuyRequest {
    private User user;
    private LocalDateTime transactionTime;
    private boolean isAvailable;
    private Product product;

    public BuyRequest(final User user, final LocalDateTime transactionTime, boolean isAvailable, Product product) {
        this.user = user;
        this.transactionTime = transactionTime;
        this.isAvailable = isAvailable;
        this.product = product;

    }

    public User getUser() { return user; }

    public LocalDateTime getTransactionTime() { return transactionTime; }

    public boolean getAvailable()
    {
        return isAvailable;
    }

    public Product getProduct()
    {
        return product;
    }
}
