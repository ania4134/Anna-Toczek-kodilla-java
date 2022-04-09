package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Producer {

    private String name = "Healthy Shop";

    @Override
    public String getName() {
        return name;
    }

    public boolean process(OrderRequest orderRequest, OrderService orderService, StoreDatabase storeDatabase) {
        System.out.println("Welcome to " + name + ", super healthy food for your body. Quality guarantee provided.");
        boolean isOrdered = orderService.order(orderRequest, storeDatabase);
        if (isOrdered) {
            System.out.println("Order completed. Order will be with you soon..");
            return true;
        } else {
            System.out.println("So sorry! Order failed. Try again");
            return false;
        }
    }
}
