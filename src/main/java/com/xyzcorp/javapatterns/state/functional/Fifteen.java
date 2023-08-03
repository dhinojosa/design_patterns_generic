package com.xyzcorp.javapatterns.state.functional;

public record Fifteen() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return switch (opponentsScore) {
            case Won w -> this;
            case Lost s -> this;
            default -> new Thirty();
        };



    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}
