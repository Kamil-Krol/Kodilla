package com.kodilla.good.patterns.challenges;

public class VendingMachine {
    private Product product;
    private Available available;

    public VendingMachine(final Product product,final Available available) {
        this.product = product;
        this.available = available;
    }

}
