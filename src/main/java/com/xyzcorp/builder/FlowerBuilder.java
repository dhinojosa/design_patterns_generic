package com.xyzcorp.builder;

public class FlowerBuilder {
    private int petals;
    private String latinName;

    protected FlowerBuilder petals(int numPetals) {
        this.petals = numPetals;
        return this;
    }

    public int getPetals() {
        return petals;
    }

    public FlowerBuilder latinName(String latinName) {
        this.latinName = latinName;
        return this;
    }

    public String getLatinName() {
        return latinName;
    }

    public Flower build() {
        return new Flower(this);
    }
}
