package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Producer {

    private String name = "Gluten Free Shop";

    @Override
    public String getName() {
        return name;
    }

    public boolean process(OrderRequest orderRequest, OrderService orderService, StoreDatabase storeDatabase) {
        System.out.println("Hi there! "+ name + " is absolutely must buy shop at your area. We offer you local gluten free food. ");
        boolean isOrdered = orderService.order(orderRequest, storeDatabase);
        if (isOrdered) {
            System.out.println("Order completed. Product will be dispatching within 12 h");
            return true;
        } else {
            System.out.println("So sorry! Order failed.");
            return false;
        }
    }
}
