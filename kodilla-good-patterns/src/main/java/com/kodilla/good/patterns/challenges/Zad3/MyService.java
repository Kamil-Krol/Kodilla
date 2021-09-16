package com.kodilla.good.patterns.challenges.Zad3;

public class MyService implements Service{
    @Override
    public void buy(String product, String type, int quantity, String provider) {
        System.out.println("Your order: " + product + "\n type: " + type + "\n quantity: " + quantity + "\n provider: " + provider);
    }
}
