package com.xyzcorp.javapatterns.interpreter.classic;

public class Multiply implements Expression {
    private final Expression left;
    private final Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context c) {
        right.interpret(c);
        left.interpret(c);
        c.push(c.pop() * c.pop());
    }
}
