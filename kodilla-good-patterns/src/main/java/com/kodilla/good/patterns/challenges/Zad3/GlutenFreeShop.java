package com.kodilla.good.patterns.challenges.Zad3;

public class GlutenFreeShop extends Product{
    private int deliveryFee;

    public GlutenFreeShop(String product, String type, int quantity,String provider, int deliveryFee) {
        super(product, type, quantity, provider);
        this.deliveryFee = deliveryFee;
    }
    public void process()
    {

    }
}
