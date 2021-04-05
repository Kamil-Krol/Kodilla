package com.kodilla.good.patterns.challenges;

public class Product {
    private Product product;

    public Product(Product product) {
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
