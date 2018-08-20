package com.xyzcorp.javapatterns.bridge;

public abstract class Draw {

    abstract Ink getInk();
    abstract String getShape();

    public void draw() {
        System.out.println("Drawing a " + getShape() + " with " + getInk().getColor() + " ink");
    }
}
