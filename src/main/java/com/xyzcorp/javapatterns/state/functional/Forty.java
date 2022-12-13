package com.xyzcorp.javapatterns.state.functional;

public record Forty() implements Score {
    @Override
    public Score winsRound(Score opponentsScore) {
        return switch (opponentsScore) {
            case Won w -> this;
            case Lost s -> this;
            case Forty f -> new Advantage();
            case Advantage a -> this;
            default -> new Won();
        };
    }

    @Override
    public Score losesRound(Score opponentsScore) {
        return this;
    }
}
