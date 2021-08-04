package com.kodilla.good.patterns.challenges.Zad3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        {
           // Product product = new Product("carrot","small",6,"GlutenFreeShop");
           // Product product = new Product("carrot","small",6,"HealthyShop");
            Product product = new Product("carrot","small",6,"ExtraFoodShop");

            switch (product.getProvider()){
                case "GlutenFreeShop":
                    GlutenFreeShop glutenFreeShop = new GlutenFreeShop(new MyInformationService(),new MyRepository(), new MyService());
                    glutenFreeShop.process(product,10);
                    break;
                case "HealthyShop":
                    HealthyShop healthyShop = new HealthyShop(new MyInformationService(),new MyRepository(), new MyService());
                    healthyShop.process(product,"courier delivery");
                    break;
                case "ExtraFoodShop":
                    ExtraFoodShop extraFoodShop = new ExtraFoodShop(new MyInformationService(),new MyRepository(), new MyService());
                    extraFoodShop.process(product,LocalDateTime.of(2021,12,3,12,00));
                    break;


            }












//            ExtraFoodShop extraFoodShop = new ExtraFoodShop("Carrot", "Vegetable", 1000, LocalDateTime.of(2021, 12, 02, 15, 0), "ExtraFoodShop");
//            HealthyShop healthyShop = new HealthyShop("Apple", "Fruit", 500, "HealthyShop", "fast delivery");
//            GlutenFreeShop glutenFreeShop = new GlutenFreeShop("Gluten free  chocolate bar", "Sweets", 200, "GlutenFreeShop", 100);
        }
    }
}

