package com.kodilla.good.patterns.challenges.Zad3;

import java.time.LocalDateTime;

public class GlutenFreeShop {

    private InformationService informationService;
    private Repository repository;
    private Service service;

    public GlutenFreeShop(final InformationService informationService,final Repository repository,final Service service) {

        this.informationService = informationService;
        this.repository = repository;
        this.service = service;

    }
    public BoughtDto process(final Product product, int deliveryFee)
    {
        informationService.inform();
        System.out.println("Delivery fee: " + deliveryFee);
        repository.boughtProducts(product);
        service.buy(product.getProduct(),product.getType(),product.getQuantity(),product.getProvider());
        return new BoughtDto(product,true);
    }
}
