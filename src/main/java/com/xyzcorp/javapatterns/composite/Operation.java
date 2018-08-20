package com.xyzcorp.javapatterns.composite;

public enum Operation {
    PLUS("+") {
        @Override
        public double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs) {
            return rhs.calculate() + lhs.calculate();
        }
    },
    MINUS("-") {
        @Override
        public double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs) {
            return rhs.calculate() - lhs.calculate();
        }
    },
    MULTIPLICATION("*") {
        @Override
        public double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs) {
            return rhs.calculate() * lhs.calculate();
        }
    },
    DIVISION("/") {
        @Override
        public double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs) {
            return rhs.calculate() / lhs.calculate();
        }
    };

    private String op;

    private Operation(String op) {
        this.op = op;
    }

    public abstract double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs);

    public String getOp() {
        return op;
    }
}