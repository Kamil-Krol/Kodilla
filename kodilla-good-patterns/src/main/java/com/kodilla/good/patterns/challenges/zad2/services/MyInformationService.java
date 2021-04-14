package com.kodilla.good.patterns.challenges.zad2.services;

import com.kodilla.good.patterns.challenges.zad2.domain.User;

public class MyInformationService implements InformationService {
    public  void inform(User user, boolean isAvailable)
    {
        if(isAvailable) {
            System.out.println("The purchased product will be delivered soon");
        }

        else
        {
            System.out.println("Product is sold out");
        }
    }
}
