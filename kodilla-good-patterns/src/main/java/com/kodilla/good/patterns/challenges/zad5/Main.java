package com.kodilla.good.patterns.challenges.zad5;


public class Main {

    public static void main(String[] args) {

        FlightRepository flightRepository = new FlightRepository();
        SearchFlight searchFlight = new SearchFlight("Wroclaw", "Gdansk", "Warszawa", "byConnectingFlight");

        SearchingProcessor searchingProcessor = new SearchingProcessor(new MyInformationService(), new MyRepository(), new MyService());

        switch (searchFlight.getSearchType()) {
            case "byConnectingFlight":

                searchingProcessor.searchByConnectingFlight(flightRepository.getFlightRepo(), searchFlight);
                break;
            case "byArrival":

                searchingProcessor.searchByArrival(flightRepository.getFlightRepo(), searchFlight);
                break;
            case "byDeparture":

                searchingProcessor.searchByDeparture(flightRepository.getFlightRepo(), searchFlight);
                break;

        }
    }
}
