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

    public rentalDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(), orderRequest.getItem(), orderRequest.getOrderTime());
        if(isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createOrderRepository(orderRequest);
        }
    }
}
