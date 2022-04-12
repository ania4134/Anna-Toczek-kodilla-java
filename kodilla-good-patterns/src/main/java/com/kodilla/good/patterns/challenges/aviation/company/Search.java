package com.kodilla.good.patterns.challenges.aviation.company;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    FlightDatabase flightDatabase = new FlightDatabase();

    public Set<Flight> flightsFrom(String city) {

        Set<Flight> listFlightFrom = flightDatabase.createFlightDatabase().stream()
                .filter(c -> c.getFrom().equals(city.toUpperCase()))
                .collect(Collectors.toSet());

        return listFlightFrom;
    }

    public Set<Flight> flightsTo(String city) {

        Set<Flight> listFlightTo = flightDatabase.createFlightDatabase().stream()
                .filter(c -> c.getTo().equals(city.toUpperCase()))
                .collect(Collectors.toSet());

        return listFlightTo;
    }

    public Set<Flight> flightsThrough(String from, String through, String to) {
        Set<Flight> listThrough = new HashSet<>();

        Set<Flight> listFlightFromThrough = flightDatabase.createFlightDatabase().stream()
                .filter(c -> c.getFrom().equals(from.toUpperCase()) && c.getTo().equals(through.toUpperCase()))
                .collect(Collectors.toSet());

        Set<Flight> listFlightThroughTo = flightDatabase.createFlightDatabase().stream()
                .filter(c -> c.getFrom().equals(through.toUpperCase()) && c.getTo().equals(to.toUpperCase()))
                .collect(Collectors.toSet());
        listThrough.addAll(listFlightFromThrough);
        listThrough.addAll(listFlightThroughTo);

        return listThrough;
    }
}
