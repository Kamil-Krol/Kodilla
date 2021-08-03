package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SearchFlight {

    public void findFlight(Flight flight) throws NullPointerException
    {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Amsterdam",false);
        flightMap.put("Poznan",false);
        flightMap.put("Berlin",true);


        if(flightMap.containsKey(flight.getArrivalAirport()))
        {
            //boolean result = flightMap.get(flight.getArrivalAirport()).booleanValue();
            Boolean result = flightMap.entrySet().stream().filter(e-> flight.getArrivalAirport().equals(e.getKey())).map(x->x.getValue()).


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


