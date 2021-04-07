package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService {
    public static void main(String[] args) {
        //RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        //RentRequest rentRequest = rentRequestRetriever.retrieve();
        Retriever retriever = new Retriever();
        PurchaseOffer offer = retriever.retrieve();

        VendingMachine vendingMachine = new VendingMachine(
                new MailService(), new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);
    }
}
