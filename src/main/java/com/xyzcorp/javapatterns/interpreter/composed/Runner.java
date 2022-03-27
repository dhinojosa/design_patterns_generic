package com.xyzcorp.javapatterns.interpreter.composed;

public class Runner {
    @SuppressWarnings("PatternVariableCanBeUsed")
    public static void main(String[] args) {
        Sum sum = new Sum(new Constant(30), new Constant(50));
        if (sum.interpret() instanceof Constant) {
            Constant number = (Constant) sum.interpret();
            System.out.println(number.getNumber());
        } else {
            throw new RuntimeException("Did not work");
        }
    }
}
