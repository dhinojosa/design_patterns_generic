package com.xyzcorp.javapatterns.adapter;

/**
 * @author John Ericksen
 */
public class CelsiusToFahrenheitAdapter implements FahrenheitThermometer {

    private final CelsiusThermometer celsiusThermometer;

    public CelsiusToFahrenheitAdapter(CelsiusThermometer celsiusThermometer) {
        this.celsiusThermometer = celsiusThermometer;
    }

    public double getTemperateInF() {
        return convertCtoF(celsiusThermometer.getTemperateInC());
    }

    private double convertCtoF(double c) {
        return (c * 9 / 5) + 32;
    }

}
