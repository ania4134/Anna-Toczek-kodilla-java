package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.orderService.Customer;

import java.time.LocalDateTime;

public class OrderRequest {
    private Customer customer;
    private Product product;
    private int amountOfProduct;
    private Producer producer;
    LocalDateTime timeOfOrder;

    public OrderRequest(Customer customer, Product product, int amountOfProduct, Producer producer, LocalDateTime timeOfOrder) {
        this.customer = customer;
        this.product = product;
        this.amountOfProduct = amountOfProduct;
        this.producer = producer;
        this.timeOfOrder = timeOfOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public Producer getProducer() {
        return producer;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }
}
