package com.kodilla.good.patterns.challenges.zad2.domain;

public class SellDto {
    private User user;
    private boolean isSold;

    public SellDto(final User user, final boolean isSold)
    {
        this.isSold = isSold;
        this.user = user;
    }
}
