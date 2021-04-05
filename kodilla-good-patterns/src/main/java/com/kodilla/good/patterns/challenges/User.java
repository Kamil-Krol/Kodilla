package com.kodilla.good.patterns.challenges;

public class User {
    private User user;

    public User(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
