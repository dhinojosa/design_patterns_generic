package com.xyzcorp.javapatterns.interpreter.composed;

public class Multiply implements Expression {
    private final Expression left;
    private final Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        int lExpr = left.interpret();
        int rExpr = right.interpret();
        return lExpr * rExpr;
    }
}
