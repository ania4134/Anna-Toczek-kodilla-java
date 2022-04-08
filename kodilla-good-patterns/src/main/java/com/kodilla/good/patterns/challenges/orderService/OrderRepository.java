package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public interface OrderRepository {

     void createOrderRepository(Customer customer, Item item, LocalDateTime orderTime);
}
