package com.kodilla.testing.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop() {
        //given
        long sum = 0;
        //when
        for(int n = 0; n < 1000; n++) {
            sum += n;
            System.out.println("[" + n + "] sum equals: " + sum);
        }
        //then
        Assertions.assertEquals(499500, sum);
    }
}
