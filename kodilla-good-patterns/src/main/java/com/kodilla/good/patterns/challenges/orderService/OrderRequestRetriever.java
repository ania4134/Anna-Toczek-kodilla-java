package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer("Ana", "White", "anawhite@gmail.com", 4563896, "address");
        LocalDateTime orderTime = LocalDateTime.of(2017, 8, 1, 12, 0);
        Item item = new Item("brush", "awesome brush", 5.68);

        return new OrderRequest(customer, orderTime, item);
    }
}
