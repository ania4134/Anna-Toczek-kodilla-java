package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class OrderItemRepository implements OrderRepository {

    public void createOrderRepository(Customer customer, Item item, LocalDateTime orderTime) {
        System.out.println("Creating order repository");
    }
}
