package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaWithMushroomsWithSalamiGetCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomsDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        System.out.println(pizza.getCost());

        //When
        BigDecimal theCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(23), theCost);
    }

    @Test
    public void testBasicPizzaWithMushroomsWithSalamiGetDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomsDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        System.out.println(pizza.getDescription());

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce & cheese + mushrooms + salami", description);
    }

    @Test
    public void testBasicPizzaWithParmaHamWithRocketSaladWithTomatoesGetCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ParmaHamDecorator(pizza);
        pizza = new RocketSaladDecorator(pizza);
        pizza = new TomatoesDecorator(pizza);
        System.out.println(pizza.getCost());

        //When
        BigDecimal theCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(27), theCost);
    }


    @Test
    public void testBasicPizzaWithParmaHamWithRocketSaladWithTomatoesGetDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ParmaHamDecorator(pizza);
        pizza = new RocketSaladDecorator(pizza);
        pizza = new TomatoesDecorator(pizza);
        System.out.println(pizza.getDescription());

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce & cheese + parma ham + rocket salad + tomatoes", description);
    }
}
