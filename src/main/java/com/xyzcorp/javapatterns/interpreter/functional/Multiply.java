package com.xyzcorp.javapatterns.interpreter.functional;

public record Multiply(Expression left, Expression right) implements Expression{
}
