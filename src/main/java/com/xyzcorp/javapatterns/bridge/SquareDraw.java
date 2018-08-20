package com.xyzcorp.javapatterns.bridge;

public class SquareDraw extends Draw {

    private final Ink ink;

    public SquareDraw(Ink ink) {
        this.ink = ink;
    }

    @Override
    Ink getInk() {
        return ink;
    }

    @Override
    String getShape() {
        return "square";
    }
}
