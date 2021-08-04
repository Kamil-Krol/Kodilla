package com.kodilla.good.patterns.challenges.Zad3;

public class BoughtDto {
    private Product product;
    private boolean isAvailable;



    public BoughtDto(Product product, boolean isAvailable) {
        this.product = product;
        this.isAvailable = isAvailable;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
