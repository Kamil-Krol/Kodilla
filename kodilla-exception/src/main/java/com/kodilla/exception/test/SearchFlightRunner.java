package com.kodilla.exception.test;

public class SearchFlightRunner {
    public static void main(String[] args) {
        SearchFlight searchFlight = new SearchFlight();
        Flight flight = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("Berlin", "Warsaw");
        Flight flight3 = new Flight("Porto", "Amsterdam");
try {
    searchFlight.findFlight(flight);
    searchFlight.findFlight(flight2);
    searchFlight.findFlight(flight3);
}
catch (RouteNotFoundException e)
{
    System.out.println("This flight is unavailable");
}


    }
}
