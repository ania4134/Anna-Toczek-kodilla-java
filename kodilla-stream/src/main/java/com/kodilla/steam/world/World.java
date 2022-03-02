package com.kodilla.steam.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    List<Continent> continents = new ArrayList<>();

    public void ListOfContinents() {
        Continent Europe = new Continent();
        Continent Asia = new Continent();
        Continent Africa = new Continent();
        Continent SouthAmerica = new Continent();
        Continent NorthAmerica = new Continent();
        continents.add(Europe);
        continents.add(Asia);
        continents.add(Africa);
        continents.add(NorthAmerica);
        continents.add(SouthAmerica);
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

//    public static void main(String[] args) {
//        World world = new World();
//        world.getPeopleQuantity();
//        Continent c = new Continent();
//        c.addCountries();
//        c.getEuropeCountries();
//        world.getContinents();
//    }
}