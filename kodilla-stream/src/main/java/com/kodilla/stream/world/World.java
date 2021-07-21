package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continents = new ArrayList<>();

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    @Override
    public String toString() {
        return "World{" +
                "continents=" + continents +
                '}';
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream().flatMap(continent -> continent.countries.stream())
                .map(c -> c.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
