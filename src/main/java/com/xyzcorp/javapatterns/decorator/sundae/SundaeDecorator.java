package com.xyzcorp.javapatterns.decorator.sundae;

/**
 * @author John Ericksen
 */
public abstract class SundaeDecorator implements Sundae {

    private Sundae decorated;

    public SundaeDecorator(Sundae decorated) {
        this.decorated = decorated;
    }

    public Sundae getDecorated() {
        return decorated;
    }
}
