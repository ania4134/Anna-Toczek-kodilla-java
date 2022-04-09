package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequest {
    private String customer;
    private Product product;
    private int amountOfProduct;
    private Producer producer;
    private LocalDateTime timeOfOrder;

    public OrderRequest(String customer, Product product, int amountOfProduct, Producer producer, LocalDateTime timeOfOrder) {
        this.customer = customer;
        this.product = product;
        this.amountOfProduct = amountOfProduct;
        this.producer = producer;
        this.timeOfOrder = timeOfOrder;
    }

    public String getCustomer() {
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

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", product=" + product +
                ", amountOfProduct=" + amountOfProduct +
                ", producer=" + producer +
                ", timeOfOrder=" + timeOfOrder +
                '}';
    }
}
