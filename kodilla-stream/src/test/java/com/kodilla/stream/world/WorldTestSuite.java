package com.kodilla.stream.world;

import com.kodilla.steam.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("3998000000");
        Assertions.assertEquals(expectedResult, result);
    }
}
