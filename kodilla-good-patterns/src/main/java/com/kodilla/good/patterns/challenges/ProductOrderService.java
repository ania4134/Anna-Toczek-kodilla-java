package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public boolean order(OrderRequest orderRequest) {
        boolean isAvailable = true;
        if(isAvailable) {
            System.out.println( "\n" + orderRequest.getCustomer().getName() + " " + orderRequest.getCustomer().getSurname()
                    + " is ordering " + orderRequest.getItem().getName() + ", price: " + orderRequest.getItem().getPrice() + ".");
            System.out.println("Order time: " + orderRequest.getOrderTime());
            return true;
        } else {
            return false;
        }
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = order(orderRequest);
        if(isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createOrderRepository(orderRequest.getCustomer(), orderRequest.getItem(), orderRequest.getOrderTime());
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getItem(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getItem(), false);
        }
    }
}
