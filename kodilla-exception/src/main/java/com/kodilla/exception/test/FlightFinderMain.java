package com.kodilla.exception.test;

public class FlightFinderMain {

    public static void main(String[] args) {
        Flight flight = new Flight("Balice Airport", "Berlin Brandenburg Airport");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Nie znaleziono takiego lotniska, " + e);
        } finally {
            System.out.println("Dziekujemy ");
        }
    }
}
