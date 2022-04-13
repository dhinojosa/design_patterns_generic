package com.xyzcorp.javapatterns.visitor.functional;


/**
 * @author John Ericksen
 */
public record Zebra(boolean isFed) implements Animal {

    public Zebra feed(Hay hay) {
        return new Zebra(true);
    }
}
