package com.xyzcorp.javapatterns.bridge;

public class CircleDraw extends Draw {

    private final Ink ink;

    public CircleDraw(Ink ink) {
        this.ink = ink;
    }

    @Override
    Ink getInk() {
        return ink;
    }

    @Override
    String getShape() {
        return "circle";
    }
}
