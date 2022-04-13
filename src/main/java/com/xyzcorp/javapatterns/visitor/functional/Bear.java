package com.xyzcorp.javapatterns.visitor.functional;


public record Bear(boolean isFed) implements Animal {

    public Bear feed(Meat meat) {
        return new Bear(true);
    }
}
