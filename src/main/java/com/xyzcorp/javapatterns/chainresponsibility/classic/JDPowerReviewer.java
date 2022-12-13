package com.xyzcorp.javapatterns.chainresponsibility.classic;

public class JDPowerReviewer implements Reviewer {

    private final Reviewer nextReviewer;

    public JDPowerReviewer(Reviewer reviewer) {
        this.nextReviewer = reviewer;
    }

    public JDPowerReviewer() {
        this.nextReviewer = null;
    }

    @Override
    public void recommend(Car car) {
        if (car.rearCamera() && car.driveLaneAssist() && car.powerSteering())
            car.addRecommendation("JD Power");
        if (nextReviewer != null) nextReviewer.recommend(car);
    }
}
