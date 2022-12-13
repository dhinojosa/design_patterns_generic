package com.xyzcorp.javapatterns.adapter;

/**
 * @author John Ericksen
 */
public class CelsiusThermometer {

    private final double temp;

    public CelsiusThermometer(double temp) {
        this.temp = temp;
    }

    public double getTemperateInC() {
        return temp;
    }
}
