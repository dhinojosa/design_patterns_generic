package com.xyzcorp.javapatterns.factorymethod.example;

public class ConcreteCountry implements Country {

    private String name;
    private String capital;
    private byte[] flagBytes;

    public ConcreteCountry(String name, byte[] flagBytes, String capital) {
        this.name = name;
        this.capital = capital;
        this.flagBytes = flagBytes;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public byte[] getFlag() {
        return flagBytes;
    }

    @Override
    public String capital() {
        return capital;
    }
}
