package com.xyzcorp.javapatterns.interpreter.classic;

public class Runner {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = new Sum(new Constant(1), new Constant(3));
        expression.interpret(context);

        System.out.println(context.pop());

        System.out.println("------------------------");

        Context context2 = new Context();
        Expression expression2 = new Sum(new Constant(6), new Subtract(new Constant(3), new Constant(2)));
        expression2.interpret(context2);

        System.out.println(context2.pop());

        System.out.println("-------------------------");

        Context context3 = new Context();
        Expression expression3 = new Multiply(new Constant(6), new Subtract(new Constant(3), new Constant(2)));
        expression3.interpret(context3);

        System.out.println(context3.pop());
    }
}
