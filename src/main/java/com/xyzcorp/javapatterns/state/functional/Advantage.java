package com.xyzcorp.javapatterns.state.functional;

public final class Advantage implements Score {
    @Override
    public Score winsRound(Score opponentsScore) {

        return new Won();
    }

    @Override
    public Score losesRound(Score opponentsScore) {
        return new Forty();
    }
}
