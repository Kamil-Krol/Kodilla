package com.kodilla.good.patterns.challenges;

public class VendingMachine {
    private InformationService informationService;
    private Service service;
    private Repository repository;

    public VendingMachine(final InformationService informationService, final Service service, final Repository repository) {
        this.informationService = informationService;
        this.service = service;
        this.repository = repository;
    }

    public BoughtBy process(final PurchaseOffer offer,final Product product ) {
        boolean isAvailable = service.rent(offer.getUser(), offer.getTransactionTime(), product.getProduct(), product.isAvailable());

        if (isAvailable) {
            informationService.inform(offer.getUser());
            repository.sell(offer.getUser(), offer.getTransactionTime());
            return new BoughtBy(offer.getUser(), true);
        } else {
            return new BoughtBy(offer.getUser(), false);
        }
    }
}
