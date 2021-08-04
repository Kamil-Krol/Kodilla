package com.kodilla.good.patterns.challenges.Zad3;

import java.time.LocalDateTime;

public class HealthyShop {

    private InformationService informationService;
    private Repository repository;
    private Service service;

    public HealthyShop(final InformationService informationService,final Repository repository,final Service service) {

        this.informationService = informationService;
        this.repository = repository;
        this.service = service;

    }

    public BoughtDto process(final Product product, String deliveryType)
    {
        informationService.inform();
        System.out.println("Delivery type: " + deliveryType);
        repository.boughtProducts(product);
        service.buy(product.getProduct(),product.getType(),product.getQuantity(),product.getProvider());
        return new BoughtDto(product,true);
    }
}
