package com.xyzcorp.javapatterns.state.functional;

public record Player(String name, Score score) {
    public Player(String name) {
        this(name, new Love());
    }

    public Player beats(Player opponent) {
        return new Player(name, score.winsRound(opponent.score));
    }

    public Player losesTo(Player opponent) {
        return new Player(name, score.losesRound(opponent.score));
    }
}
