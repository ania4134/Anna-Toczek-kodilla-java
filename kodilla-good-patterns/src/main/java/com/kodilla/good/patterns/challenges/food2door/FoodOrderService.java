package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderService implements OrderService {

    public boolean order(OrderRequest orderRequest) {
        boolean result = false;

        if (orderRequest.getProducer().getListOfProducts().contains(orderRequest.getProduct())) {
            System.out.println(orderRequest.getCustomer() + "is ordering " + orderRequest.getProduct() +
                    ", amount " + orderRequest.getAmountOfProduct() + " from " + orderRequest.getProducer().getName());
            result = true;
        }
        return result;
    }
}
