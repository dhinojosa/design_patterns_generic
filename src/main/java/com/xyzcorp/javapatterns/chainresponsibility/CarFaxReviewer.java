package com.xyzcorp.javapatterns.chainresponsibility;

public class CarFaxReviewer implements Reviewer {

    private final Reviewer nextReviewer;

    public CarFaxReviewer(Reviewer nextReviewer) {
        this.nextReviewer = nextReviewer;
    }

    public CarFaxReviewer() {
        this.nextReviewer = null;
    }

    @Override
    public void recommend(Car car) {
        if (car.driverAirBags()) car.addRecommendation("CarFax");
        if (nextReviewer != null) nextReviewer.recommend(car);
    }
}
