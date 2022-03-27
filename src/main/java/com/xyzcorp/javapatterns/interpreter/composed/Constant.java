package com.xyzcorp.javapatterns.interpreter.composed;


//Terminal Operation
public class Constant implements Expression {

    private final int number;

    public Constant(int number) {
        this.number = number;
    }

    public int interpret() {
        return number;
    }
}
