package com.xyzcorp.javapatterns.chainresponsibility;

public class JDPowerReviewer implements Reviewer {

    private Reviewer nextReviewer;

    public JDPowerReviewer(Reviewer reviewer) {
        this.nextReviewer = reviewer;
    }

    public JDPowerReviewer() {
        this.nextReviewer = null;
    }

    @Override
    public void recommend(Car car) {
        if (car.rearCamera() && car.driveLaneAssist() && car.powerSteering())
            car.addRecommendation("CarFax");
        if (nextReviewer != null) nextReviewer.recommend(car);
    }
}
