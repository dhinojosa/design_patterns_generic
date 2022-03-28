package com.xyzcorp.javapatterns.chainresponsibility.classic;

public class CarAndBuyerReviewer implements Reviewer {

    private final Reviewer nextReviewer;

    public CarAndBuyerReviewer(Reviewer nextReviewer) {
        this.nextReviewer = nextReviewer;
    }

    public CarAndBuyerReviewer() {
        this.nextReviewer = null;
    }

    @Override
    public void recommend(Car car) {
        if (car.passengerAirBags() && car.driverAirBags())
            car.addRecommendation("Car and Buyer");
        if (nextReviewer != null) nextReviewer.recommend(car);
    }
}
