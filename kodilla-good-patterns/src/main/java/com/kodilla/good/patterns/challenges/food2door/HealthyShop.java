package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashSet;
import java.util.Set;

public class HealthyShop implements Producer {

    private String name = "Healthy Shop";
    private Set<Product> listOfProducts = new HashSet<>();

    @Override
    public String getName() {
        return name;
    }

    public Set<Product> getListOfProducts() {
        return listOfProducts;
    }

    public boolean addProduct(Product product) {
        listOfProducts.add(product);
        return true;
    }

    public boolean removeProduct(Product product) {
        if(listOfProducts.contains(product)) {
            listOfProducts.remove(product);
            return true;
        } else {
            System.out.println("No data found");
            return false;
        }
    }
}
