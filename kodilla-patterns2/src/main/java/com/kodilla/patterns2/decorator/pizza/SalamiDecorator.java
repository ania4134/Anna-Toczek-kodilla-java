package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractBasicPizzaDecorator {

    public SalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + salami";
    }
}
