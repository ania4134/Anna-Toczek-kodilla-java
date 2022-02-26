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
       BigDecimal peopleQuantityOfEurope;
       BigDecimal peopleQuantityOfAsia;
       BigDecimal peopleQuantityOfAfrica;
       BigDecimal peopleQuantityOfNorthAmerica;
       BigDecimal peopleQuantityOfSouthAmerica;

        peopleQuantityOfEurope = getContinents().stream()
                .flatMap(continent -> continent.getEuropeCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        peopleQuantityOfAsia = getContinents().stream()
                .flatMap(continent -> continent.getAsiaCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        peopleQuantityOfAfrica = getContinents().stream()
                .flatMap(continent -> continent.getAfricaCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        peopleQuantityOfNorthAmerica = getContinents().stream()
                .flatMap(continent -> continent.getNorthAmericaCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        peopleQuantityOfSouthAmerica = getContinents().stream()
                .flatMap(continent -> continent.getSouthAmericaCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //return

    }
}
