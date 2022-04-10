package com.xyzcorp.javapatterns.decorator.sundae;

/**
 * @author John Ericksen
 */
public class FudgeSundaeDecorator extends SundaeDecorator {
    public FudgeSundaeDecorator(Sundae sundae) {
        super(sundae);
    }

    public String describeSundae() {
        return "Fudge " + getDecorated().describeSundae();
    }
}
