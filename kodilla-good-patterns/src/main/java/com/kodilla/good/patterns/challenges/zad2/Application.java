package com.kodilla.good.patterns.challenges.zad2;


import com.kodilla.good.patterns.challenges.zad2.domain.BuyRequest;
import com.kodilla.good.patterns.challenges.zad2.repositories.MyRepository;
import com.kodilla.good.patterns.challenges.zad2.services.MyInformationService;
import com.kodilla.good.patterns.challenges.zad2.services.MyService;

public class Application {
    public static void main(String[] args) {
        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();
        MyProcessor myProcessor = new MyProcessor(new MyRepository(), new MyService(), new MyInformationService());
        myProcessor.process(buyRequest);
    }
}
