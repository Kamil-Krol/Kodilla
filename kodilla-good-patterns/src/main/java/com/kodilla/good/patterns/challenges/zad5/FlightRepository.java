package com.kodilla.good.patterns.challenges.zad5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    public Map<DepartureAirport,ArrivalAirport> getFlightRepo()
    {

        Map<DepartureAirport,ArrivalAirport> flights = new HashMap<>();


        ArrivalAirport arrivalAirport1 = new ArrivalAirport("Warszawa");
        ArrivalAirport arrivalAirport2 = new ArrivalAirport("Wroclaw");
        ArrivalAirport arrivalAirport3 = new ArrivalAirport("Wroclaw");
        ArrivalAirport arrivalAirport4 = new ArrivalAirport("Krakow");

        DepartureAirport departureAirport1 = new DepartureAirport("Gdansk");
        DepartureAirport departureAirport2 = new DepartureAirport("Warszawa");
        DepartureAirport departureAirport3 = new DepartureAirport("Gdansk");
        DepartureAirport departureAirport4 = new DepartureAirport("Gdansk");

        flights.put(departureAirport1,arrivalAirport1);
        flights.put(departureAirport2,arrivalAirport2);
        flights.put(departureAirport3,arrivalAirport3);
        flights.put(departureAirport4,arrivalAirport4);

        return flights;

    }

}


