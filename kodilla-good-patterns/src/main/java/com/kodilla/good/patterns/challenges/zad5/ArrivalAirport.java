package com.kodilla.good.patterns.challenges.zad5;

import java.util.Objects;

public class ArrivalAirport {
    private String arrivalAirport;

    public ArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrivalAirport that = (ArrivalAirport) o;
        return Objects.equals(arrivalAirport, that.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivalAirport);
    }
}
