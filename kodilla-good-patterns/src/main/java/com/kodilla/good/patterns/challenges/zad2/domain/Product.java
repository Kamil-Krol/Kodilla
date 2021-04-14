package com.kodilla.good.patterns.challenges.zad2.domain;

public class Product {
    private String product;

    public Product(final String product) {
        this.product = product;

    }

    @Override
    public String toString() {
        return product;
    }
}

