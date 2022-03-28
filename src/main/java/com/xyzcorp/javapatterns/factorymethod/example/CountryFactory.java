package com.xyzcorp.javapatterns.factorymethod.example;

public interface CountryFactory {
    Country createCountry(String name, byte[] flag, String capital);
}
