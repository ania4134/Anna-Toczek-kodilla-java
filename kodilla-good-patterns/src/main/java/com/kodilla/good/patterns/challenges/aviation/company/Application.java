package com.kodilla.good.patterns.challenges.aviation.company;

import java.util.Set;

public class Application {

    public static void main(String[] args) {
        String cityOfDeparture = "Wroclaw";
        String destinationCity = "Rzeszow";
        String destinationCity2 = "warszawa-Modlin";
        String transitCity = "warszawa-Modlin";
        String transitCity2 = "Rzeszow";

        Search search = new Search();
        Set<Flight> flightsFrom = search.flightsFrom(cityOfDeparture);
        Set<Flight> flightsTo = search.flightsTo(destinationCity);
        Set<Flight> flightsThrough = search.flightsThrough(cityOfDeparture, transitCity, destinationCity);
        Set<Flight> flightsThrough2 = search.flightsThrough(cityOfDeparture, transitCity2, destinationCity2);

        System.out.println("\nFlights from " + cityOfDeparture + flightsFrom);
        System.out.println("\nFlights to " + destinationCity + flightsTo);
        System.out.println("\nFlights through " + cityOfDeparture + "-->" + transitCity + "-->" + destinationCity + flightsThrough);
        System.out.println("\nFlights through " + cityOfDeparture + "-->" + transitCity2 + "-->" + destinationCity2 + flightsThrough2);
    }
}
