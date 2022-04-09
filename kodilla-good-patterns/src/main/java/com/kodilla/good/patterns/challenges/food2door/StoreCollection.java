package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashSet;
import java.util.Set;

public class StoreCollection {

    public static void main(String[] args) {

        Set<Product> storeCollection = new HashSet<>();
        ProducersCollection producersCollection = new ProducersCollection();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        producersCollection.addProducer(extraFoodShop);
        producersCollection.addProducer(glutenFreeShop);
        producersCollection.addProducer(healthyShop);

        Product carrotDrink = new Product("Carrot drink", 4.55, "420.A2");
        Product appleMousse = new Product("Apple mousse", 4.55, "430.B3");
        Product egg12x = new Product("Free Range Eggs 12x", 5, "60.A1");
        Product cabbageJuice = new Product("Cabbage juice", 4.55, "400.A2");
        Product beetrootSlices = new Product("Beetroot slices", 4.55, "100.A3");
        Product almondFlour = new Product("Almond flour", 8.05, "310.A3");
        Product coconutFlour = new Product("Coconut flour", 8.50, "310.A5");
        Product oatMilk = new Product("Oat milk 1l", 8.50, "100,8B");
        Product vegeMilk = new Product("Vege milk, 0.5l", 7, "100.8A");

        extraFoodShop.addProduct(carrotDrink);
        extraFoodShop.addProduct(appleMousse);
        extraFoodShop.addProduct(egg12x);

        glutenFreeShop.addProduct(cabbageJuice);
        glutenFreeShop.addProduct(beetrootSlices);
        glutenFreeShop.addProduct(almondFlour);

        healthyShop.addProduct(coconutFlour);
        healthyShop.addProduct(oatMilk);
        healthyShop.addProduct(vegeMilk);

        storeCollection.addAll(extraFoodShop.getListOfProducts());
        storeCollection.addAll(glutenFreeShop.getListOfProducts());
        storeCollection.addAll(healthyShop.getListOfProducts());

        System.out.println(storeCollection);
    }
}
