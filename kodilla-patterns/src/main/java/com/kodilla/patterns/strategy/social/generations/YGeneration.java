package com.kodilla.patterns.strategy.social.generations;

import com.kodilla.patterns.strategy.social.FacebookPublisher;
import com.kodilla.patterns.strategy.social.User;

public class YGeneration extends User {
    public YGeneration(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
