package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class SearchFlight {

    public void findFlight(Flight flight) throws NullPointerException
    {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Amsterdam",false);
        flightMap.put("Poznan",false);
        flightMap.put("Berlin",true);


        if(flightMap.containsKey(flight.getArrivalAirport()))
        {
            Boolean result = flightMap.entrySet().stream()
                    .filter(e-> flight.getArrivalAirport()
                    .equals(e.getKey()))
                    .anyMatch(e->e.getValue());

            if (result) {
                System.out.println("Do you want to book this flight?");
            } else {
                System.out.println("All tickets booked");
            }
        }

        else {
            throw new RouteNotFoundException();
        }
    }

}


