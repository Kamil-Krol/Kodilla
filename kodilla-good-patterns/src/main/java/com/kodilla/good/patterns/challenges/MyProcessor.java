package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.domain.BuyRequest;
import com.kodilla.good.patterns.challenges.domain.SellDto;
import com.kodilla.good.patterns.challenges.repositories.Repository;
import com.kodilla.good.patterns.challenges.services.InformationService;
import com.kodilla.good.patterns.challenges.services.Service;

public class MyProcessor {
    private Repository repository;
    private Service service;
    private InformationService informationService;


    public MyProcessor(Repository repository, Service service, InformationService informationService) {
        this.repository = repository;
        this.service = service;
        this.informationService = informationService;
    }

   public SellDto process(final BuyRequest buyRequest)
   {

       boolean isSold = buyRequest.getAvailable();
       if (isSold) {
           service.sell(buyRequest.getUser(), buyRequest.getTransactionTime(), buyRequest.getProduct(), buyRequest.getAvailable());
           informationService.inform(buyRequest.getUser(),true);
           repository.soldProducts(buyRequest.getUser(), buyRequest.getProduct(), buyRequest.getTransactionTime());
           return new SellDto(buyRequest.getUser(), true);
       }
       else {
           informationService.inform(buyRequest.getUser(),false);
           return new SellDto(buyRequest.getUser(), false);
       }
   }
}

