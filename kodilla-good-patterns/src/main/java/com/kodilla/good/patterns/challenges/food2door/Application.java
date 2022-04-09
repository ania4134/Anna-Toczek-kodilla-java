package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever retriever = new OrderRequestRetriever();
        retriever.retrieve();
        StoreDatabase storeDatabase = new StoreDatabase();
        storeDatabase.ProductsDatabase();
        OrderRequest orderRequest = new OrderRequest(retriever.retrieve().getCustomer(), retriever.retrieve().getProduct(),
                retriever.retrieve().getAmountOfProduct(), retriever.retrieve().getProducer(), retriever.retrieve().getTimeOfOrder());
        FoodOrderService foodOrderService = new FoodOrderService();
        foodOrderService.order(orderRequest, storeDatabase);
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.process(orderRequest,foodOrderService, storeDatabase);
    }
}
