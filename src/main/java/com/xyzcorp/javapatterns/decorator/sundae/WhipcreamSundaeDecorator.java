package com.xyzcorp.javapatterns.decorator.sundae;

/**
 * @author John Ericksen
 */
public class WhipcreamSundaeDecorator extends SundaeDecorator {
    public WhipcreamSundaeDecorator(Sundae sundae) {
        super(sundae);
    }

    public String describeSundae() {
        return "Whipcream " + getDecorated().describeSundae();
    }
}
