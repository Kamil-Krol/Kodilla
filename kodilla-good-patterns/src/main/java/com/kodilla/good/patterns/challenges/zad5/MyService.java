package com.kodilla.good.patterns.challenges.zad5;

import java.util.Map;

public class MyService implements  Service{
    public void book(Map<DepartureAirport,ArrivalAirport> map) {
        System.out.println("You booked flight");
    }
}
