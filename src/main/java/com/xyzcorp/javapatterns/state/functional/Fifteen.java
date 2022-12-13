package com.xyzcorp.javapatterns.state.functional;

public record Fifteen() implements Score {
    @Override
    public Score winsRound(Score opponentsScore) {
        return switch (opponentsScore) {
            case Won w -> this;
            case Lost s -> this;
            default -> new Thirty();
        };



    }

    @Override
    public Score losesRound(Score opponentsScore) {
        return this;
    }
}
