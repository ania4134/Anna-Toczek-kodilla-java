package com.kodilla.stream.world;

import com.kodilla.steam.world.Continent;
import com.kodilla.steam.world.Country;
import com.kodilla.steam.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("4000000"));
        Country germany = new Country("Germany", new BigDecimal("6000000"));
        Country usa = new Country("USA", new BigDecimal("11000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(usa);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("21000000");
        Assertions.assertEquals(expectedResult, result);
    }
}
