package com.kodilla.good.patterns.challenges.aviation.company;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    FlightDatabase flightDatabase = new FlightDatabase();
    Flight firstFlight;
    Flight nextFlight;

    public void flightsFrom(String city) {

        Set<Flight> listFlightFrom = flightDatabase.createFlightDatabase().stream().
                filter(c -> c.getFrom().equals(city.toUpperCase())).
                filter(d -> d.getDepartureTime().isAfter(LocalDateTime.now())).
                collect(Collectors.toSet());

        System.out.println("\nFlights from " + city + ":\n " + listFlightFrom + "\n");
    }

    public void flightsTo(String city) {

        Set<Flight> listFlightTo = flightDatabase.createFlightDatabase().stream().
                filter(c -> c.getTo().equals(city.toUpperCase())).
                filter(d -> d.getDepartureTime().isAfter(LocalDateTime.now())).
                collect(Collectors.toSet());

        System.out.println("Flights to " + city + ":\n " + listFlightTo + "\n");
    }

    public void flightsThrough(String from, String through, String to) {

        Set<Flight> listFlightFromThrough = flightDatabase.createFlightDatabase().stream().
                filter(c -> c.getFrom().equals(from.toUpperCase()) && c.getTo().equals(through.toUpperCase())).
                filter(d -> d.getDepartureTime().isAfter(LocalDateTime.now())).
                collect(Collectors.toSet());

        Set<Flight> listFlightThroughTo = flightDatabase.createFlightDatabase().stream().
                filter(c -> c.getFrom().equals(through.toUpperCase()) && c.getTo().equals(to.toUpperCase())).
                filter(d -> d.getDepartureTime().isAfter(LocalDateTime.now())).
                collect(Collectors.toSet());

        if (listFlightFromThrough.contains(firstFlight) && listFlightThroughTo.contains(nextFlight)
                && firstFlight.getArrivalTime().isBefore(nextFlight.getDepartureTime())) {
            System.out.println("Flight " + from + "--> " + through + "--> " + to + ": \n" + firstFlight + "\n" + nextFlight);
        }
    }
}
