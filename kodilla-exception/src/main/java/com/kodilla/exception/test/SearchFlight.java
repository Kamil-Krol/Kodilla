package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class SearchFlight {

    public void findFlight(Flight flight) throws NullPointerException
    {
       FlightMap flightMap = new FlightMap();

        if(flightMap.getFlightMap().containsKey(flight.getArrivalAirport()))
        {
            Boolean result = flightMap.getFlightMap().entrySet().stream()
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


