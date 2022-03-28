package com.xyzcorp.javapatterns.chainresponsibility.classic;

import java.util.List;

public interface Car {
    String getMake();

    String getModel();

    int getYear();

    boolean powerSteering();

    boolean driverAirBags();

    boolean passengerAirBags();

    boolean seatHeaters();

    boolean seatCoolers();

    boolean driveLaneAssist();

    boolean rearCamera();

    void addRecommendation(String name);

    List<String> getRecommendations();
}
