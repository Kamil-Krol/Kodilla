package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Retriever {
    public PurchaseOffer retrieve()
    {
        User user = new User("dsjd");
        LocalDateTime transactionTime = LocalDateTime.of(2021,8,3,15,0);
        return new PurchaseOffer(user,transactionTime);
    }
}
