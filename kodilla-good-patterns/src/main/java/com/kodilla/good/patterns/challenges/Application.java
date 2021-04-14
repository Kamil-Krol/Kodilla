package com.kodilla.good.patterns.challenges;


import com.kodilla.good.patterns.challenges.domain.BuyRequest;
import com.kodilla.good.patterns.challenges.repositories.MyRepository;
import com.kodilla.good.patterns.challenges.services.MyInformationService;
import com.kodilla.good.patterns.challenges.services.MyService;

public class Application {
    public static void main(String[] args) {
        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();
        MyProcessor myProcessor = new MyProcessor(new MyRepository(), new MyService(), new MyInformationService());
        myProcessor.process(buyRequest);
    }
}
