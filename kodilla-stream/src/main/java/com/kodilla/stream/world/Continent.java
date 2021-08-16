package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;
    List<Country> countries;

    public Continent(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }
}
