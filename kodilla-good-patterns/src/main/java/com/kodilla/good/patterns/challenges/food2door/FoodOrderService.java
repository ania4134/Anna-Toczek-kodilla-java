package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderService implements OrderService {

    public boolean order(OrderRequest orderRequest, StoreDatabase storeDatabase) {
        boolean result = false;
        boolean isCorrectProduct = storeDatabase.allProducts.containsKey(orderRequest.getProduct());
        boolean isAvailable = orderRequest.getAmountOfProduct() < storeDatabase.allProducts.get(orderRequest.getProduct());

        if (isCorrectProduct && isAvailable) {
            System.out.println(orderRequest.getCustomer() + "  is ordering  " + orderRequest.getProduct() +
                    ",  amount  " + orderRequest.getAmountOfProduct() + "  from  " + orderRequest.getProducer().getName());
            result = true;
        }
        return result;
    }
}
