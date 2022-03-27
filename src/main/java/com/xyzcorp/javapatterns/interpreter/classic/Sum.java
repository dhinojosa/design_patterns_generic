package com.xyzcorp.javapatterns.interpreter.classic;

public class Sum implements Expression {
    private final Expression left;
    private final Expression right;

    public Sum(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context c) {
        left.interpret(c);
        right.interpret(c);
        c.push(c.pop() + c.pop());
    }
}
