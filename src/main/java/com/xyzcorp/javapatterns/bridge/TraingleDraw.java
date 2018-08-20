package com.xyzcorp.javapatterns.bridge;

public class TraingleDraw extends Draw {

    private final Ink ink;

    public TraingleDraw(Ink ink) {
        this.ink = ink;
    }

    @Override
    Ink getInk() {
        return ink;
    }

    @Override
    String getShape() {
        return "triangle";
    }
}
