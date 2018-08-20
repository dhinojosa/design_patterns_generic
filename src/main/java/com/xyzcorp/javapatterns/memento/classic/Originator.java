package com.xyzcorp.javapatterns.memento.classic;

public class Originator<E> {
    private E state;
    // The class could also contain additional data that is not part of the
    // state saved in the memento..

    public void set(E state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);
    }

    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento<>(this.state);
    }

    public void restoreFromMemento(Memento<E> memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    public static class Memento<S> {
        private final S state;

        public Memento(S stateToSave) {
            state = stateToSave;
        }

        // accessible by outer class only
        private S getSavedState() {
            return state;
        }
    }
}
