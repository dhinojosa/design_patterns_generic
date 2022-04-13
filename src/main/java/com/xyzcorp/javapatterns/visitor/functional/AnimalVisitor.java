package com.xyzcorp.javapatterns.visitor.functional;

/**
 * @author John Ericksen
 */
public interface AnimalVisitor {
    Animal visit(Animal animal);
}
