package com.kodilla.good.patterns.challenges.zad5;

import java.util.HashMap;
import java.util.Map;

public class FlightRepository {

    public Map<String,String> repo(String flight) {
        Map<String,String> flights = new HashMap<>();
        flights.put("Gdansk","Warszawa");
        flights.put("Warszawa","Wroclaw");
        flights.put("Gdansk","Wroclaw");
        flights.put("Gdansk","Krakow");

        return flights;
    }

}
