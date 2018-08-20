package com.xyzcorp.javapatterns.chainresponsibility;

public class CarAndBuyerReviewer implements Reviewer {

    private Reviewer nextReviewer;

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
