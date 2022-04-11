package com.kodilla.good.patterns.challenges.aviation.company;

public class Application {

    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.createFlightDatabase();
        flightDatabase.getFlightSet();
        Search search = new Search();
        search.flightsFrom("Wroclaw");
        search.flightsTo("Rzeszow");
        search.flightsThrough("Wroclaw", "Rzeszow", "Warszawa-Modlin");
    }

}
