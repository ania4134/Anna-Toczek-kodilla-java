package com.kodilla.good.patterns.challenges.food2door;

import java.util.Set;

public interface Producer {

    String getName();

    boolean process(OrderRequest orderRequest, OrderService orderService, StoreDatabase storeDatabase);
}
