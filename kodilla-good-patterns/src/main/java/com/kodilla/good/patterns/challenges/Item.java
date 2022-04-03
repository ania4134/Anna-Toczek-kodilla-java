package com.kodilla.good.patterns.challenges;

public class Item {
    private String name;
    private String description;
    private double price;

    public Item(String name,String description, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
