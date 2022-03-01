package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbablyWillThrowException {

    @Test
    void testProbablyWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.0)),  //zly x, dobry y
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.0)),  //zly x, dobry y
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.99, 1.5)),  //dobry x, zly y
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5)), // dobry x, zly y
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.00, 1.5)),  // zly x, zly y
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 1.0))
        );
    }

}
