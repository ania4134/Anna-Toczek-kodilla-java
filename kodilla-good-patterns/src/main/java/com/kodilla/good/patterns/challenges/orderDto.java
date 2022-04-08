package com.kodilla.good.patterns.challenges;

public class orderDto {

    public orderDto(Customer customer, Item item,  boolean isOrdered) {

        if(isOrdered) {
            System.out.println("Order completed: " + item + ", " + customer);
        } else {
            System.out.println("Order failed: " + item + ", " + customer);
        }
    }
}
