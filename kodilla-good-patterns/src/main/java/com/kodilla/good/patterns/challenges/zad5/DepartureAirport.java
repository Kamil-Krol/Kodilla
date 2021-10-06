package com.kodilla.good.patterns.challenges.zad5;

import java.util.Objects;

public class DepartureAirport {

    private String departureAirport;

    public DepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartureAirport that = (DepartureAirport) o;
        return Objects.equals(departureAirport, that.departureAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport);
    }
}
