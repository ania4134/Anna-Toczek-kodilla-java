package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> destinations = new HashMap<>();
        destinations.put("London Luton Airport", true);
        destinations.put("Berlin Brandenburg Airport", false);
        destinations.put("Chopin Warsaw Airport", true);
        destinations.put("Manchester Airport", true);

        if(destinations.containsKey(flight.getArrivalAirport())) {
            if(destinations.get(flight.getArrivalAirport()) == true) {
                System.out.println("Z " + flight.getDepartureAirport() + " jest możliwy lot do " + flight.getArrivalAirport());
            } else {
                System.out.println("Z " + flight.getDepartureAirport() + " nie jest możliwy lot na do " + flight.getArrivalAirport());
            }
        } else {
            throw new RouteNotFoundException();
        }
    }
}
