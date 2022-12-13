package com.xyzcorp.javapatterns.adapter;

/**
 * @author John Ericksen
 */
public class AdapterDemonstration {

    public static void main(String[] args) {

        CelsiusThermometer celsiusThermometer = new CelsiusThermometer(34);

        FahrenheitThermometer thermometer = new CelsiusToFahrenheitAdapter(celsiusThermometer);

        System.out.println(
                "Celcius: " + celsiusThermometer.getTemperateInC() +
                        " Fahrenheit: " + thermometer.getTemperateInF());
    }
}
