package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BuyRequest {
    private User user;
    private LocalDateTime transactionTime;
    public boolean available;
    public Product product;

    public BuyRequest(final User user, final LocalDateTime transactionTime, boolean available,Product product) {
        this.user = user;
        this.transactionTime = transactionTime;
        this.available = available;
        this.product = product;

    }

    public User getUser() { return user; }

    public LocalDateTime getTransactionTime() { return transactionTime; }

    public boolean getAvailable()
    {
        return available;
    }

    public Product getProduct()
    {
        return product;
    }
}
