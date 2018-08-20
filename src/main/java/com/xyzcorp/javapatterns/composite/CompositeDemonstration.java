package com.xyzcorp.javapatterns.composite;

/**
 * @author John Ericksen
 */
public class CompositeDemonstration {

    public static void main(String[] args) {

        // (4 + 6) * (1 / 2)
        ArithmeticExpression calculation =
                new Operand(
                        new Operand(new Number(4), Operation.PLUS, new Number(6)),
                        Operation.MULTIPLICATION,
                        new Operand(new Number(1), Operation.DIVISION, new Number(2)));

        System.out.println(calculation.toString() + " = " + calculation.calculate());
    }
}
