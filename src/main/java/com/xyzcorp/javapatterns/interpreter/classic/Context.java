package com.xyzcorp.javapatterns.interpreter.classic;

import java.util.Stack;

public class Context {

    private final Stack<Integer> numbers = new Stack<>();

    public Integer pop() {
        return numbers.pop();
    }

    public void push(Integer number) {
        numbers.push(number);
    }
}
