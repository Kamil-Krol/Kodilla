package com.kodilla.good.patterns.challenges.Zad3;

public class HealthyShop extends Product{
    private String deliveryType;

    public HealthyShop(String product, String type, int quantity,String provider, String deliveryType) {
        super(product, type, quantity, provider);
        this.deliveryType = deliveryType;
    }
}
