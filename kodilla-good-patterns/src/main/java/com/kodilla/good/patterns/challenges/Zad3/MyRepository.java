package com.kodilla.good.patterns.challenges.Zad3;

public class MyRepository implements Repository{
    @Override
    public void boughtProducts(Product product) {
        System.out.println("Products saved in repository");
    }
}
