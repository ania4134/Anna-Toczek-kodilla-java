package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.orderService.Customer;

public class FoodOrderService implements OrderService {

    public boolean order(Customer customer, Product product, int amount, Producer producer) {
        boolean result = false;

        if (producer.getListOfProducts().contains(product)) {
            System.out.println(customer + "is ordering " + product + ", amount " + amount + " from " + producer.getName());
            result = true;
        }
        return result;
    }
}
