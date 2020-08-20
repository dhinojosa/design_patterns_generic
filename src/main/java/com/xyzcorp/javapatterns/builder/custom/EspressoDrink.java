package com.xyzcorp.javapatterns.builder.custom;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:58 PM
 */
public class EspressoDrink {
    private int shots;
    private boolean skimMilk;
    private boolean sprinkles;
    private boolean decaf;
    private boolean whip;

    protected EspressoDrink(EspressoDrinkBuilder espressoDrinkBuilder) {
        this.shots = espressoDrinkBuilder.getShots();
        this.skimMilk = espressoDrinkBuilder.isSkimMilk();
        this.sprinkles = espressoDrinkBuilder.isSprinkles();
        this.decaf = espressoDrinkBuilder.isDecaf();
        this.whip = espressoDrinkBuilder.isWhip();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EspressoDrink{");
        sb.append("shots=").append(shots);
        sb.append(", skimMilk=").append(skimMilk);
        sb.append(", sprinkles=").append(sprinkles);
        sb.append(", decaf=").append(decaf);
        sb.append(", whip=").append(whip);
        sb.append('}');
        return sb.toString();
    }
}
