package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            System.out.println(firstChallenge.divide(3, 0));
        } catch (ArithmeticException e ) {
            System.out.println("Oh no! Something went wrong! Error: "+ e);
        } finally {
            System.out.println("Never divide by zero!");
        }
    }
}

