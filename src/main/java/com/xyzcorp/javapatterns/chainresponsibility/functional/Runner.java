package com.xyzcorp.javapatterns.chainresponsibility.functional;


import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        Reviewer carAndBuyer = car -> {
            if (car.passengerAirBags() && car.driverAirBags())
                return Optional.of("Car and Buyer");
            else return Optional.empty();
        };

        Reviewer carFax = car -> {
            if (car.driverAirBags())
                return Optional.of("CarFax");
            else return Optional.empty();
        };

        Reviewer jdPower = car -> {
            if (car.rearCamera() && car.driveLaneAssist() && car.powerSteering())
                return Optional.of("CarFax");
            else return Optional.empty();
        };

        Stream<Reviewer> reviewerStream = Stream.of(carAndBuyer, carFax, jdPower);
        Car car = new Car("Honda", "Accord", 2011, true, true, false, true, true);
        List<String> approvals =
            reviewerStream.flatMap(reviewer -> reviewer.review(car).stream()).toList();
        System.out.println(approvals);
    }
}
