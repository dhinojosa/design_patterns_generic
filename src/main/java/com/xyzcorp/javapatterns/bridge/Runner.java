package com.xyzcorp.javapatterns.bridge;

public class Runner {

    public static void main(String[] args) {
        CircleDraw circleDraw = new CircleDraw(new BlueInk());
        circleDraw.draw();
    }
}
