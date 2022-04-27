package com.kodilla.spring.calculator;

import com.kodilla.spring.clculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        // When
        double result1 = calculator.add(4.5, 0.5);
        double result2 =calculator.sub(6.5, 1.5);
        double result3 =calculator.mul(10, 0.5);
        double result4 =calculator.div(2.5, 0.5);

        //Then
        assertEquals(result1, 5);
        assertEquals(result2, 5);
        assertEquals(result3, 5);
        assertEquals(result4, 5);
    }
}
