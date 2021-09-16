package com.kodilla.good.patterns.challenges.Zad3;

import java.time.LocalDateTime;

public class ExtraFoodShop {

    private InformationService informationService;
    private Repository repository;
    private Service service;

    public ExtraFoodShop(final InformationService informationService,final Repository repository,final Service service) {

        this.informationService = informationService;
        this.repository = repository;
        this.service = service;

    }

public BoughtDto process(final Product product, LocalDateTime deliveryTime)
{
    informationService.inform();
    System.out.println("Delivery time: " + deliveryTime.getHour() + ":" + String.format("%02d", deliveryTime.getMinute()) + "      " + deliveryTime.getDayOfMonth() + "." + deliveryTime.getMonth() + "." + deliveryTime.getYear());
    repository.saveBoughtProduct(product);
    service.buy(product.getProduct(),product.getType(),product.getQuantity(),product.getProvider());
    return new BoughtDto(product,true);
}

}
