package com.xyzcorp.javapatterns.interpreter.functional;

public class Runner {
    public static void main(String[] args) {
        Expression expression = new Multiply(new Constant(40),
            new Sum(new Constant(40), new Constant(60)));
        System.out.println(evaluate(expression));
    }

    private static int evaluate(Expression expression) {
        return switch(expression) {
            case Constant c -> c.number();
            case Sum    s -> evaluate(s.left()) + evaluate(s.right());
            case Subtract s -> evaluate(s.left()) - evaluate(s.right());
            case Multiply s -> evaluate(s.left()) * evaluate(s.right());
        };
    }
}
