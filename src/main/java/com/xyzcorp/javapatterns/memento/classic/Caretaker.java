package com.xyzcorp.javapatterns.memento.classic;

import java.util.Stack;

public class Caretaker<S> {
    private Stack<Originator.Memento<S>> stack;

    public Caretaker() {
        this.stack = new Stack<>();
    }

    public void addMemento(Originator.Memento<S> memento) {
        this.stack.push(memento);
    }

    public Originator.Memento<S> getLastMemento() {
        return this.stack.pop();
    }
}
