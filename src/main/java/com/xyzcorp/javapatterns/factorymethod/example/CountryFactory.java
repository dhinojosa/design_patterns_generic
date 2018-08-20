package com.xyzcorp.javapatterns.factorymethod.example;

import com.xyzcorp.javapatterns.chainresponsibility.Car;

public interface CountryFactory {
    public Country createCountry(String name, byte[] flag, String capital);
}
