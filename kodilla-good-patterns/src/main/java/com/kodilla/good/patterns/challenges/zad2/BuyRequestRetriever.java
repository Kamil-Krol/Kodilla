package com.kodilla.good.patterns.challenges.zad2;

import com.kodilla.good.patterns.challenges.zad2.domain.BuyRequest;
import com.kodilla.good.patterns.challenges.zad2.domain.Product;
import com.kodilla.good.patterns.challenges.zad2.domain.User;

import java.time.LocalDateTime;

public class BuyRequestRetriever {
    public BuyRequest retrieve()
    {
        User user = new User("Jan");
        LocalDateTime transactionTime = LocalDateTime.of(2021,10,13,20,15,43);
        Product product = new Product("Kalkulator");
        return new BuyRequest(user,transactionTime,true,product);
    }
}
