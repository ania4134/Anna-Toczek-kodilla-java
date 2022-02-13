package com.kodilla.testing.colletion;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }


    @DisplayName("When created list is empty, then exterminate method should return empty list")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        //Given
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> expectedResultEmptyList = new ArrayList<>();


        //When
        OddNumbersExterminator list = new OddNumbersExterminator(emptyList);
        List<Integer> resultEmpty = list.exterminate(emptyList);
        System.out.println("Testing empty list:" + emptyList);


        //Then
        Assertions.assertEquals(resultEmpty,expectedResultEmptyList);
        System.out.println("Empty list test ok");
    }

    @DisplayName("When created list contain even and uneven numbers, then exterminate method should return even numbers only")

    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(51);
        numbers.add(12);
        numbers.add(18);
        numbers.add(7);

        List<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(8);
        expectedResultList.add(2);
        expectedResultList.add(12);
        expectedResultList.add(18);


        //When
        OddNumbersExterminator numbersList = new OddNumbersExterminator(numbers);
        List<Integer> resultEven = numbersList.exterminate(numbers);
        System.out.println("Testing Even List: " + resultEven);


        //Then
        for (int i = 0; i < resultEven.size(); i++) {
            Assertions.assertEquals(expectedResultList.get(i), resultEven.get(i));
        }
        System.out.println("Even list test ok");
    }
}
