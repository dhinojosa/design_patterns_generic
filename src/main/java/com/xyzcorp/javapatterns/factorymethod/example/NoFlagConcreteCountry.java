package com.xyzcorp.javapatterns.factorymethod.example;

public class AlternateConcreteCountry implements Country {
    private String name;
    private String capital;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public byte[] getFlag() {
        throw new UnsupportedOperationException("Holding flag data too big, won't do it");
    }

    @Override
    public String capital() {
        return capital;
    }
}
