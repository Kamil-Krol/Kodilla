package com.kodilla.good.patterns.challenges.zad2.domain;

public class User {
    private String user;

    public User(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return user;
    }
}
