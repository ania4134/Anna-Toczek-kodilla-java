package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public orderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(), orderRequest.getItem(), orderRequest.getOrderTime());
        if(isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createOrderRepository(orderRequest.getCustomer(), orderRequest.getItem(), orderRequest.getOrderTime());
            return new orderDto(orderRequest.getCustomer(), orderRequest.getItem(), true);
        } else {
            return new orderDto(orderRequest.getCustomer(), orderRequest.getItem(), false);
        }
    }
}
