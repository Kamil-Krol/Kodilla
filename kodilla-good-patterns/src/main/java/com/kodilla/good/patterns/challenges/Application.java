package com.kodilla.good.patterns.challenges;



public class Application {
    public static void main(String[] args) {
        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();
        MyProcessor myProcessor = new MyProcessor(new MyRepository(), new MyService(), new MyInformationService());
        myProcessor.process(buyRequest);
    }
}
