package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private Customer customer;
    private LocalDateTime orderTime;
    private Item item;

    public OrderRequest(Customer customer, LocalDateTime orderTime, Item item) {
        this.customer = customer;
        this.orderTime = orderTime;
        this.item = item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Item getItem() {
        return item;
    }
}
