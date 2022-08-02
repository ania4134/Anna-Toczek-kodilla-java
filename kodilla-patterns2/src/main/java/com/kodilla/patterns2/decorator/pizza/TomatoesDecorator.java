package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TomatoesDecorator extends AbstractBasicPizzaDecorator {

    public TomatoesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + tomatoes";
    }
}
