package com.kodilla.good.patterns.challenges;

public class MyInformationService implements InformationService{
    public  void inform(User user, boolean available)
    {
        if(available) {
            System.out.println("The purchased product will be delivered soon");
        }

        else
        {
            System.out.println("Product is sold out");
        }
    }
}
