package com.kodilla.good.patterns.challenges.aviation.company;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    public String from;
    public String to;

    public void flightsFrom(String city) {
        FlightDatabase flightDatabase = new FlightDatabase();

        Set<Flight> listFlightFrom = flightDatabase.createFlightDatabase().stream().
                filter(c -> c.getFrom().equals(city.toUpperCase())).
                filter(d -> d.getDepartureTime().isAfter(LocalDateTime.now())).
                collect(Collectors.toSet());

        System.out.println("\nFlights from " + city + ":\n " + listFlightFrom + "\n");
    }

    public void flightsTo(String city) {
        FlightDatabase flightDatabase = new FlightDatabase();

        Set<Flight> listFlightTo = flightDatabase.createFlightDatabase().stream().
                filter(c -> c.getTo().equals(city.toUpperCase())).
                filter(d -> d.getDepartureTime().isAfter(LocalDateTime.now())).
                collect(Collectors.toSet());

        System.out.println("Flights to " + city + ":\n " + listFlightTo + "\n");
    }
}
