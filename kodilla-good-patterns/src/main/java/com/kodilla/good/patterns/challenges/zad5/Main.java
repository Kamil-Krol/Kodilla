package com.kodilla.good.patterns.challenges.zad5;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FlightRepository flightRepository = new FlightRepository();
        SearchFlight searchFlight = new SearchFlight("Gdansk", "Wroclaw", "Warszawa", "byArrival");

        SearchingProcessor searchingProcessor = new SearchingProcessor(new MyInformationService(), new MyRepository(), new MyService());

        switch (searchFlight.getSearchType()) {
            case "byConnectingFlight":

                searchingProcessor.searchByConnectingFlight(flightRepository.flightrepo(), searchFlight);
                break;
            case "byArrival":

                searchingProcessor.searchByArrival(flightRepository.flightrepo(), searchFlight);
                break;
            case "byDeparture":

                searchingProcessor.searchByDeparture(flightRepository.flightrepo(), searchFlight);
                break;

        }


        //  SearchFlight searchFlight = new SearchFlight(new MyInformationService(), new MyRepository(), new MyService());


    }
}
