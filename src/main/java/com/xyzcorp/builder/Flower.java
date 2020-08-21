package com.xyzcorp.builder;

public class Flower {

    private int petals;
    private String latinName;

    protected Flower(FlowerBuilder flowerBuilder) {
       this.petals = flowerBuilder.getPetals();
       this.latinName = flowerBuilder.getLatinName();
    }

    public static FlowerBuilder builder() {
        return new FlowerBuilder();
    }

    public int getPetals() {
        return petals;
    }

    public String getLatinName() {
        return latinName;
    }
}
