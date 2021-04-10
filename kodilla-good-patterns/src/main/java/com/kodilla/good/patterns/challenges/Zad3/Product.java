package com.kodilla.good.patterns.challenges.Zad3;

abstract class Product {
    private String product;
    private String type;
    private int quantity;
    private String provider;


    public Product(String product, String type, int quantity, String provider) {
        this.product = product;
        this.type = type;
        this.quantity = quantity;
        this.provider = provider;
    }

    public String getProduct() {
        return product;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProvider() {
        return provider;
    }
}
