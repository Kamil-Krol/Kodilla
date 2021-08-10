package com.kodilla.patterns.strategy.social.generations;

import com.kodilla.patterns.strategy.social.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.User;

public class ZGeneration extends User {
    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
