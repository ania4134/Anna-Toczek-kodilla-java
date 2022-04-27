package com.kodilla.good.patterns.challenges.aviation.company;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public final class FlightDatabase {

    public Set<Flight> createFlightDatabase() {
        Set<Flight> flightSet = new HashSet<>();

        Flight wroWmi = new Flight("WROCLAW", "WARSZAWA-MODLIN", LocalDateTime.of(2022,05,05,8,50),
                LocalDateTime.of(2022,05,05,9,50), 110);
        Flight wroRze = new Flight("WROCLAW", "RZESZOW", LocalDateTime.of(2022, 5, 8, 12,20),
                LocalDateTime.of(2022,5,8,13,20), 90);
        Flight rzeWmi = new Flight("RZESZOW", "WARSZAWA-MODLIN", LocalDateTime.of(2022, 5, 8, 16,00),
                LocalDateTime.of(2022, 5, 8, 17,00), 110);
        Flight wmiRze = new Flight("WARSZAWA-MODLIN", "RZESZOW", LocalDateTime.of(2022, 5, 9, 15,00),
                LocalDateTime.of(2022, 5, 9, 16,00),100);

        flightSet.add(wroWmi);
        flightSet.add(wroRze);
        flightSet.add(rzeWmi);
        flightSet.add(wmiRze);

        return flightSet;
    }
}
