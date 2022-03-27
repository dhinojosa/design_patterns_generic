package com.xyzcorp.javapatterns.interpreter.composed;

public class Runner {
    public static void main(String[] args) {
        Expression sum = new Multiply(new Sum(new Constant(30), new Constant(50)), new Constant(2));
        System.out.println(sum.interpret());
    }
}
