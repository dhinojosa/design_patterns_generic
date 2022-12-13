package com.xyzcorp.javapatterns.state.functional;

public record Won() implements Score {
    @Override
    public Score winsRound(Score opponentsScore) {
        return this;
    }

    @Override
    public Score losesRound(Score opponentsScore) {
        return this;
    }
}
