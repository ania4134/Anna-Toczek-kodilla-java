package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsDecorator extends AbstractBasicPizzaDecorator {

    public MushroomsDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + mushrooms";
    }
}
