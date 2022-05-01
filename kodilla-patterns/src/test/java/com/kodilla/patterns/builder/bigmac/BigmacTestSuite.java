package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient(Ingredient.BEKON)
                .sauce(Sauce.BARBECUE)
                .bun(Bun.BEZ_SEZAMU)
                .burgers(2)
                .ingredient(Ingredient.CEBULA)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assertions.assertEquals(2, howManyIngredients);
    }
}
