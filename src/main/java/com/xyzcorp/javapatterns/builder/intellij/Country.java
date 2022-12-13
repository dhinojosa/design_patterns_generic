package com.xyzcorp.javapatterns.builder.intellij;

public class Country {
    private final String name;
    private final String capital;
    private final String demonym;

    private final int population;

    private final String currency;

    protected Country(String name, String capital, String demonym,
                   int population, String currency) {
        this.name = name;
        this.capital = capital;
        this.demonym = demonym;
        this.population = population;
        this.currency = currency;
    }
}
