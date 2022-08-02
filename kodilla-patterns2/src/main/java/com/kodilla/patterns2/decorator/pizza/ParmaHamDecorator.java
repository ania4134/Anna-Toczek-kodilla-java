package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ParmaHamDecorator extends AbstractBasicPizzaDecorator {

    public ParmaHamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + parma ham";
    }
}
