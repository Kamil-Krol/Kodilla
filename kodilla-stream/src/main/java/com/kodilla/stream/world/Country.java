package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private BigDecimal PeopleQuantity;
    private String name;

    public Country(BigDecimal peopleQuantity, String name) {
        PeopleQuantity = peopleQuantity;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "PeopleQuantity=" + PeopleQuantity +
                ", name='" + name + '\'' +
                '}';
    }
}
