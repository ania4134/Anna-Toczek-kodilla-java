package com.kodilla.good.patterns.challenges.food2door;



import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public  OrderRequest retrieve() {
        String customer = "Paul Wilson, email: paulwilson@gmail.com, phone no. 8523697, address";
        Producer producer = new ExtraFoodShop();
        Product product = new Product("Carrot drink", 4.55, "420.A2");
        int amountOfProduct = 2;
        LocalDateTime timeOfOrder = LocalDateTime.of(2022, 5,2,16,14,56);

        return new OrderRequest(customer, product, amountOfProduct, producer, timeOfOrder);
    }
}
