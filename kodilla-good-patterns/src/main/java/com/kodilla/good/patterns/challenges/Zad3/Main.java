package com.kodilla.good.patterns.challenges.Zad3;

import java.time.LocalDateTime;

public class Main {
    ExtraFoodShop extraFoodShop = new ExtraFoodShop("Carrot","Vegetable",1000, LocalDateTime.of(2021,12,02,15,0), "ExtraFoodShop");
    HealthyShop healthyShop = new HealthyShop("Apple","Fruit",500,"HealthyShop","fast delivery" );
    GlutenFreeShop glutenFreeShop = new GlutenFreeShop("Gluten free  chocolate bar", "Sweets",200,"GlutenFreeShop", 100 );
}
