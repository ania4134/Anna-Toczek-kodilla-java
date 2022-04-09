package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Producer {

    private String name = "Extra Food Shop";

    @Override
    public String getName() {
        return name;
    }

    public boolean process(OrderRequest orderRequest, OrderService orderService, StoreDatabase storeDatabase) {
        System.out.println("Welcome to " + name + "! We are happy that our store was your choice.");
        boolean isOrdered = orderService.order(orderRequest, storeDatabase);

        if (isOrdered) {
            System.out.println("Order completed.");
            return true;
        } else {
            System.out.println("So sorry! Order failed.");
            return false;
        }
    }
}
