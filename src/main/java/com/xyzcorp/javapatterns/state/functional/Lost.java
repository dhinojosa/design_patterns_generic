package com.xyzcorp.javapatterns.state.functional;

public record Lost() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return this;
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}
