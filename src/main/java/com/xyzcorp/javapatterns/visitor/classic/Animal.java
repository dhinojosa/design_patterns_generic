package com.xyzcorp.javapatterns.visitor.classic;

/**
 * @author John Ericksen
 */
public interface Animal {

    public void accept(AnimalVisitor visitor);
}
