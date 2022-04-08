package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtraFoodShop implements Producer {


    private String name = "Extra Food Shop";
    private Map<String, Product> listOfProducts = new HashMap();

    @Override
    public String getName() {
        return name;
    }

    public Map<String, Product> getListOfProducts() {
        return listOfProducts;
    }
}
