package com.kodilla.good.patterns.challenges.orderService;

public class Application {
    public static void main(String[] args) {
    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderItemService(), new OrderItemRepository());
        orderProcessor.process(orderRequest);
    }
}
