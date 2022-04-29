package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        logger = Logger.INSTANCE;

        //When
        logger.log("loginNr1");

        //Then
        Assertions.assertEquals("loginNr1", logger.getLastLog());
    }
}
