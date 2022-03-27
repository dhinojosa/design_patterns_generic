package com.xyzcorp.javapatterns.interpreter.functional;

public record Sum(Expression left, Expression right) implements Expression{
}
