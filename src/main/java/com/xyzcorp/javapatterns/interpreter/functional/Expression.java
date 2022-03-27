package com.xyzcorp.javapatterns.interpreter.functional;

public sealed interface Expression permits Constant, Sum, Subtract, Multiply {
}


