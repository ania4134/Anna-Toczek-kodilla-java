package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class StoreDatabase {

    Map<Product, Integer> extraFoodShopProducts = new HashMap<>();
    Map<Product, Integer> glutenFreeShopProducts = new HashMap<>();
    Map<Product, Integer> healthyShopProducts = new HashMap<>();
    Map<Product, Integer> allProducts = new HashMap<>();

    Product carrotDrink = new Product("Carrot drink", 4.55, "420.A2");
    Product appleMousse = new Product("Apple mousse", 4.55, "430.B3");
    Product egg12x = new Product("Free Range Eggs 12x", 5, "60.A1");
    Product cabbageJuice = new Product("Cabbage juice", 4.55, "400.A2");
    Product beetrootSlices = new Product("Beetroot slices", 4.55, "100.A3");
    Product almondFlour = new Product("Almond flour", 8.05, "310.A3");
    Product coconutFlour = new Product("Coconut flour", 8.50, "310.A5");
    Product oatMilk = new Product("Oat milk 1l", 8.50, "100,8B");
    Product vegeMilk = new Product("Vege milk, 0.5l", 7, "100.8A");

    public void ProductsDatabase() {
        extraFoodShopProducts.put(carrotDrink, 56);
        extraFoodShopProducts.put(appleMousse, 84);
        extraFoodShopProducts.put(egg12x, 16);

        glutenFreeShopProducts.put(cabbageJuice, 19);
        glutenFreeShopProducts.put(beetrootSlices, 6);
        glutenFreeShopProducts.put(almondFlour, 5);

        healthyShopProducts.put(coconutFlour, 56);
        healthyShopProducts.put(oatMilk, 34);
        healthyShopProducts.put(vegeMilk, 9);

        allProducts.putAll(extraFoodShopProducts);
        allProducts.putAll(glutenFreeShopProducts);
        allProducts.putAll(healthyShopProducts);
    }

    public Map<Product, Integer> getAllProducts() {
        return allProducts;
    }

    public Map<Product, Integer> getExtraFoodShopProducts() {
        return extraFoodShopProducts;
    }

    public Map<Product, Integer> getGlutenFreeShopProducts() {
        return glutenFreeShopProducts;
    }

    public Map<Product, Integer> getHealthyShopProducts() {
        return healthyShopProducts;
    }
}
