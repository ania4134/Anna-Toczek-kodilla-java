package com.kodilla.steam.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    List<Country> europe = new ArrayList<>();
    List<Country> asia = new ArrayList<>();
    List<Country> africa = new ArrayList<>();
    List<Country> southAmerica = new ArrayList<>();
    List<Country> northAmerica = new ArrayList<>();


    public void Europe() {

        Country france = new Country("France", new BigDecimal("67390000"));
        Country germany = new Country("Germany", new BigDecimal("81000000"));
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country england = new Country("England", new BigDecimal("55000000"));
        Country italy = new Country("Italy", new BigDecimal("40000000"));

        europe.add(france);
        europe.add(germany);
        europe.add(poland);
        europe.add(england);
        europe.add(italy);
    }


    public void Asia(){

        Country russia = new Country("Russia", new BigDecimal("144000000"));
        Country china = new Country("Cina", new BigDecimal("1400000000"));
        Country india = new Country("India", new BigDecimal("1300000000"));

        asia.add(russia);
        asia.add(china);
        asia.add(india);
    }


    public void Africa() {

        Country egypt = new Country("Egypt", new BigDecimal("100000000"));
        Country rpa = new Country("RPA", new BigDecimal("50000000"));
        Country sudan = new Country("Sudan", new BigDecimal("80000000"));

        africa.add(egypt);
        africa.add(rpa);
        africa.add(sudan);
    }


    public void SouthAmerica(){

        Country brazil = new Country("Brazil", new BigDecimal("100000000"));
        Country argentina = new Country("Argentina", new BigDecimal("60000000"));
        Country colombia = new Country("Colombia", new BigDecimal("50000000"));

        southAmerica.add(brazil);
        southAmerica.add(argentina);
        southAmerica.add(colombia);
    }


    public void NorthAmerica(){

        Country usa = new Country("USA", new BigDecimal("330000000"));
        Country canada = new Country("Canada", new BigDecimal("100000000"));
        Country mexico = new Country("Mexico", new BigDecimal("50000000"));

        northAmerica.add(usa);
        northAmerica.add(canada);
        northAmerica.add(mexico);
    }


    public List<Country> getEuropeCountries(){
        return new ArrayList<>(europe);
    }

    public List<Country> getAsiaCountries(){
        return new ArrayList<>(asia);
    }

    public List<Country> getAfricaCountries(){
        return new ArrayList<>(africa);
    }

    public List<Country> getSouthAmericaCountries(){
        return new ArrayList<>(southAmerica);
    }

    public List<Country> getNorthAmericaCountries(){
        return new ArrayList<>(northAmerica);
    }

}
