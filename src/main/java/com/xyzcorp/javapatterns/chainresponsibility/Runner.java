package com.xyzcorp.javapatterns.chainresponsibility;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Car car = new Car() {
            private List<String> recommendations = new ArrayList<String>();

            @Override
            public String getMake() {
                return "Honda";
            }

            @Override
            public String getModel() {
                return "Accord";
            }

            @Override
            public int getYear() {
                return 2011;
            }

            @Override
            public boolean powerSteering() {
                return true;
            }

            @Override
            public boolean driverAirBags() {
                return true;
            }

            @Override
            public boolean passengerAirBags() {
                return false;
            }

            @Override
            public boolean seatHeaters() {
                return false;
            }

            @Override
            public boolean seatCoolers() {
                return false;
            }

            @Override
            public boolean driveLaneAssist() {
                return false;
            }

            @Override
            public boolean rearCamera() {
                return false;
            }

            @Override
            public void addRecommendation(String name) {
                this.recommendations.add(name);
            }

            @Override
            public List<String> getRecommendations() {
                return recommendations;
            }
        };

        CarFaxReviewer carFaxReviewer = new CarFaxReviewer();
        JDPowerReviewer jdPowerReviewer = new JDPowerReviewer(carFaxReviewer);
        CarAndBuyerReviewer carAndBuyerReviewer = new CarAndBuyerReviewer(jdPowerReviewer);

        carAndBuyerReviewer.recommend(car);

        System.out.println(car.getRecommendations());
    }
}
