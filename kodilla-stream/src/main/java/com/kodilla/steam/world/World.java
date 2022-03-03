package com.kodilla.steam.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinents(){
        return new ArrayList<>(continents);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal totalPeopleQuantity;

        totalPeopleQuantity = getContinents().stream()
                .flatMap(c -> c.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeopleQuantity;
    }
}