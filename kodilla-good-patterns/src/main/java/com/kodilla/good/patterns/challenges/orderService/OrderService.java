package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public interface OrderService {

     boolean order(final Customer customer, final Item item, LocalDateTime orderTime);
}
