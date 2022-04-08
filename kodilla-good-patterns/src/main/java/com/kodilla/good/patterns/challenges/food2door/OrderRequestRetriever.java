package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.orderService.Customer;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public  OrderRequest retrieve() {
        Customer customer = new Customer("Paul", "Wilson", "paulwilson@gmail.com", 8523697, "address");
        Producer producer = new ExtraFoodShop();
        Product product = producer.getListOfProducts().get("420.A2");
        int amountOfProduct = 2;
        LocalDateTime timeOfOrder = LocalDateTime.of(2022, 5,2,16,14,56);

        return new OrderRequest(customer, product, amountOfProduct, producer, timeOfOrder);
    }
}
