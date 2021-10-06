package com.kodilla.good.patterns.challenges.zad5;

public class SearchFlight {

    private String departure;
    private String arrival;
    private String searchType;
    private String connectingFlight;

    public SearchFlight (String departure, String arrival,String connectingFlight, String searchType)
    {
        this.arrival = arrival;
        this.departure = departure;
        this.connectingFlight = connectingFlight;
        this.searchType = searchType;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getSearchType() {
        return searchType;
    }

    public String getConnectingFlight() {
        return connectingFlight;
    }
}
