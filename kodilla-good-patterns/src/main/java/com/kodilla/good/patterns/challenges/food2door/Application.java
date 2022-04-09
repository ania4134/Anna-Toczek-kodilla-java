package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever retriever = new OrderRequestRetriever();
        retriever.retrieve();
        OrderRequest orderRequest = new OrderRequest(retriever.retrieve().getCustomer(), retriever.retrieve().getProduct(),
                retriever.retrieve().getAmountOfProduct(), retriever.retrieve().getProducer(), retriever.retrieve().getTimeOfOrder());
        FoodOrderService foodOrderService = new FoodOrderService();
        OrderProcessor orderProcessor = new OrderProcessor(retriever.retrieve().getProducer(),
                retriever.retrieve().getProduct(), foodOrderService);
        foodOrderService.order(orderRequest);
        orderProcessor.process(orderRequest);
    }
}
