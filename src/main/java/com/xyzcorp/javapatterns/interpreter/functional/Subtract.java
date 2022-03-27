package com.xyzcorp.javapatterns.interpreter.functional;

public record Subtract(Expression left, Expression right) implements Expression{
}
