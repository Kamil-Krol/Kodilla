package com.kodilla.good.patterns.challenges.zad5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchingProcessor {
    private InformationService informationService;
    private Repository repository;
    private Service service;

    public SearchingProcessor (final InformationService informationService,final Repository repository, final Service service)
    {
        this.informationService = informationService;
        this.repository = repository;
        this.service = service;
    }

    public void searchByArrival(Map<DepartureAirport,ArrivalAirport> flights,SearchFlight searchFlight)
    {
        Map<DepartureAirport,ArrivalAirport> filteredMap = flights.entrySet().stream()
                .filter(m -> searchFlight.getArrival().equals(m.getValue()))
                .collect(Collectors.toMap(e -> e.getKey(),v -> v.getValue()));
        informationService.inform();
        repository.repo(filteredMap);
        service.book(filteredMap);
    }

    public void searchByDeparture(Map<DepartureAirport,ArrivalAirport> flights,SearchFlight searchFlight)
    {
        Map<DepartureAirport,ArrivalAirport> filteredMap = flights.entrySet().stream()
                .filter(m -> searchFlight.getDeparture().equals(m.getKey()))
                .collect(Collectors.toMap(e -> e.getKey(),v -> v.getValue()));
        informationService.inform();
        repository.repo(filteredMap);
        service.book(filteredMap);
    }

    public void searchByConnectingFlight(Map<DepartureAirport,ArrivalAirport> flights,SearchFlight searchFlight)
    {
//        Map<DepartureAirport,ArrivalAirport> filteredMap = flights.entrySet().stream()
//                .filter(m -> searchFlight.getConnectingFlight().equals(m.getValue()))
//                .collect(Collectors.toMap(e -> e.getKey(),v -> v.getValue()));
//        informationService.inform();
//        repository.repo(filteredMap);
//        service.book(filteredMap);
    }
}
