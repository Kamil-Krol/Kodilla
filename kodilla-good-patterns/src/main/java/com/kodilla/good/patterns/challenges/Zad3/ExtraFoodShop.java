package com.kodilla.good.patterns.challenges.Zad3;

import java.time.LocalDateTime;

public class ExtraFoodShop extends Product{
    private LocalDateTime deliveryTime;
    private String provider;
    public ExtraFoodShop(String product, String type, int quantity,LocalDateTime deliveryTime, String provider) {
        super(product, type, quantity);
        this.deliveryTime = deliveryTime;
        this.provider = provider;
    }

public BoughtDto process(String product, String type, int quantity,LocalDateTime deliveryTime)
{

}

}
