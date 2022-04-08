package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.orderService.Customer;

public interface OrderService {

    boolean order(Customer customer, Product product, int amount, Producer producer);
}
