package com.xyzcorp.javapatterns.visitor.classic;

/**
 * @author John Ericksen
 */
public class Elephant implements Animal {

    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public void feed(Hay hay) {
        System.out.println("Yum, delicious Hay");
    }
}
