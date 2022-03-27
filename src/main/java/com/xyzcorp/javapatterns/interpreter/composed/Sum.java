package com.xyzcorp.javapatterns.interpreter.composed;

public class Sum implements Expression {
    private final Expression left;
    private final Expression right;

    public Sum(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @SuppressWarnings("PatternVariableCanBeUsed")
    @Override
    public Expression interpret() {
        Expression lExpr = left.interpret();
        Expression rExpr = right.interpret();
        if (lExpr instanceof Constant && rExpr instanceof Constant) {
            Constant lNum = (Constant) lExpr;
            Constant rNum = (Constant) rExpr;
            return new Constant(lNum.getNumber() + rNum.getNumber());
        }
        throw new RuntimeException("Expected numbers");
    }
}
