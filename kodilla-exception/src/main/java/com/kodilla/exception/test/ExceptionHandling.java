package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
           secondChallenge.probablyIWillThrowException(2.0, 1.0);
        } catch (Exception e) {
            System.out.println("Ups! Something went wrong! Exception:" + e);
        } finally {
            System.out.println("Java is my best friend ");
        }
    }
}
