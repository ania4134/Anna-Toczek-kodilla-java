package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.OrderRequest;

public class OrderProcessor {

    private Producer producer;
    private Product product;
    private OrderService orderService;

    public OrderProcessor(final Producer producer, final Product product, final OrderService orderService) {
        this.producer = producer;
        this.product = product;
        this.orderService = orderService;
    }

    public boolean process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getAmountOfProduct(), orderRequest.getProducer());
        if (isOrdered) {
            System.out.println("Order completed.");
            return true;
        } else {
            System.out.println("Order failed.");
            return false;
        }
    }
}
