package com.kodilla.good.patterns.challenges;

public class Product {
    private Product product;
    private boolean available;

    public Product(final Product product, final boolean available) {
        this.product = product;
        this.available = available;
    }
    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return available;
    }
}

