package com.xyzcorp.javapatterns.visitor;

/**
 * @author John Ericksen
 */
public interface Animal {

    public void accept(AnimalVisitor visitor);
}
