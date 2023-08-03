package com.xyzcorp.javapatterns.state.functional;

public final class Advantage implements Score {
    @Override
    public Score wins(Score opponentsScore) {

        return new Won();
    }

    @Override
    public Score loses(Score opponentsScore) {
        return new Forty();
    }
}
