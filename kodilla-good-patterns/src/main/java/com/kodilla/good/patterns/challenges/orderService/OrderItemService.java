package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class OrderItemService implements OrderService {

    public boolean order(Customer customer, Item item, LocalDateTime orderTime) {
        System.out.println("Order item");
        return true;
    }

}
