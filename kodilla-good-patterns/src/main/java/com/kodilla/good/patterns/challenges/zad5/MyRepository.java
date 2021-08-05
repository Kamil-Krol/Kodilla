package com.kodilla.good.patterns.challenges.zad5;

import java.util.Map;

public class MyRepository implements Repository{
    public void repo(Map<DepartureAirport,ArrivalAirport> flights) {
        System.out.println("Information about flights");

        for(Map.Entry<DepartureAirport,ArrivalAirport> entry : flights.entrySet())
        {
            System.out.println("Flights: " + entry.getKey() + " to " + entry.getValue() + "\n");
        }
    }
}
