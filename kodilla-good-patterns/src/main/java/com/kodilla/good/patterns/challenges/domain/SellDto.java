package com.kodilla.good.patterns.challenges.domain;

public class SellDto {
    public User user;
    public boolean isSold;

    public SellDto(final User user, final boolean isSold)
    {
        this.isSold = isSold;
        this.user = user;
    }
}
