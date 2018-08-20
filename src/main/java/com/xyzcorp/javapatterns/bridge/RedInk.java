package com.xyzcorp.javapatterns.bridge;

public class RedInk implements Ink {
    @Override
    public String getColor() {
        return "red";
    }
}
