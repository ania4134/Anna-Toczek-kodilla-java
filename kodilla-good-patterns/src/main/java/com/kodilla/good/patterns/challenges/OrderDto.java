package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private Customer customer;
    private Item item;
    private boolean isOrdered;

    public OrderDto(final Customer customer, final Item item, boolean isOrdered) {
        this.customer = customer;
        this.item = item;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Item getItem() {
        return item;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
