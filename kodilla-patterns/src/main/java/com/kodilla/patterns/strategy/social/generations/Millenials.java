package com.kodilla.patterns.strategy.social.generations;

import com.kodilla.patterns.strategy.social.TwitterPublisher;
import com.kodilla.patterns.strategy.social.User;

public class Millenials extends User {
    public Millenials(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}
