package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightMap {

    private Map<String,Boolean> flightMap = new HashMap<>();

    public FlightMap() {
        flightMap.put("Amsterdam",false);
        flightMap.put("Poznan",false);
        flightMap.put("Berlin",true);
    }

    public Map<String, Boolean> getFlightMap() {
        return flightMap;
    }

    public void setFlightMap(Map<String, Boolean> flightMap) {
        this.flightMap = flightMap;
    }
}
