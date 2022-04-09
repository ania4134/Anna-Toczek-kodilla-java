package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderItemRepository implements OrderRepository {

    public void createOrderRepository(Customer customer, Item item, LocalDateTime orderTime) {
        System.out.println("\nCreating order repository:");
        System.out.println(customer.getName() + " " + customer.getSurname() + " bought " + item.getName()
                + " , price: " + item.getPrice() + " at " + orderTime + "\n");
    }
}
