package com.kodilla.good.patterns.challenges.aviation.company;

import java.util.Set;

public class Application {

    public static void main(String[] args) {
        String cityOfDeparture = "Wroclaw";
        String destinationCity = "Rzeszow";
        String transitCity = "warszawa-Modlin";
        Search search = new Search();
        Set<Flight> flightsFrom = search.flightsFrom(cityOfDeparture);
        Set<Flight> flightsTo = search.flightsTo(destinationCity);
        Set<Flight> flightsThrough = search.flightsThrough(cityOfDeparture, transitCity, destinationCity);

        System.out.println("\nFlights from " + cityOfDeparture + flightsFrom);
        System.out.println("\nFlights to " + destinationCity + flightsTo);
        System.out.println("\nFlights through " + cityOfDeparture + "-->" + transitCity + "-->" + destinationCity + flightsThrough);
    }
}
