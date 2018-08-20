package com.xyzcorp.javapatterns.composite;

/**
 * @author John Ericksen
 */
public class Operand extends ArithmeticExpression {
    private final ArithmeticExpression rhs;
    private final ArithmeticExpression lhs;
    private Operation operation;

    public Operand(ArithmeticExpression rhs, Operation operation, ArithmeticExpression lhs) {
        this.rhs = rhs;
        this.lhs = lhs;
        this.operation = operation;
    }

    @Override
    public double calculate() {
        return operation.calculate(rhs, lhs);
    }

    @Override
    public String toString() {
        return "( " + rhs.toString() + " " + operation.getOp() + " " + lhs.toString() + " )";
    }
}
