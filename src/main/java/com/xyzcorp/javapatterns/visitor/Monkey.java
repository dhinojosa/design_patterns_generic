package com.xyzcorp.javapatterns.visitor;

/**
 * @author John Ericksen
 */
public class Monkey implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public void feed(Banana banana){
        System.out.println("Robert loves bananas!");
    }
}
