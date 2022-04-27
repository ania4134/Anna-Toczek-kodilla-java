package com.kodilla.good.patterns.challenges.aviation.company;

import java.time.LocalDateTime;

public class Flight {

    private String from;
    private String to;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double price;

    public Flight(String from, String to, LocalDateTime departureTime, LocalDateTime arrivalTime, double price) {
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n" + from + " --> " + to +
                ", departureTime: " + departureTime +
                ", arrivalTime: " + arrivalTime +
                ", price=" + price + " PLN";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (getFrom() != null ? !getFrom().equals(flight.getFrom()) : flight.getFrom() != null) return false;
        if (getTo() != null ? !getTo().equals(flight.getTo()) : flight.getTo() != null) return false;
        if (getDepartureTime() != null ? !getDepartureTime().equals(flight.getDepartureTime()) : flight.getDepartureTime() != null)
            return false;
        return getArrivalTime() != null ? getArrivalTime().equals(flight.getArrivalTime()) : flight.getArrivalTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getFrom() != null ? getFrom().hashCode() : 0;
        result = 31 * result + (getTo() != null ? getTo().hashCode() : 0);
        result = 31 * result + (getDepartureTime() != null ? getDepartureTime().hashCode() : 0);
        result = 31 * result + (getArrivalTime() != null ? getArrivalTime().hashCode() : 0);
        return result;
    }
}
