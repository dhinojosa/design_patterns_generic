package com.xyzcorp.javapatterns.factorymethod.canonical;

public class ConcreteCreator implements Creator{
    public ConcreteProduct factoryMethod() {
       return new ConcreteProduct();
    }
}
