package com.kodilla.stream.array;

import com.kodilla.steam.array.ArrayOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayOperationsTestSuite {


    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1,1,1,10,2,6,1,1,0,1,10,1,0,2,1,2,6,1,1,3};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(2.55, result);
    }
}
