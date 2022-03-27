package com.xyzcorp.javapatterns.interpreter.classic;


//Terminal Operation
public class Constant implements Expression {

    private final int number;

    public Constant(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Context c) {
        c.push(number);
    }
}
