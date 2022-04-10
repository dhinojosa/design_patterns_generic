package com.xyzcorp.javapatterns.decorator.sundae;

/**
 * @author John Ericksen
 */
public class FudgeFilterDecorator extends SundaeDecorator {
    public FudgeFilterDecorator(Sundae cherryOnTopDecorator) {
        super(cherryOnTopDecorator);
    }

    @Override
    public String describeSundae() {
        return getDecorated().describeSundae().replaceAll("Fudge", "xxxxx");
    }
}
