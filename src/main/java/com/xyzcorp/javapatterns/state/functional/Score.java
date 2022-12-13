package com.xyzcorp.javapatterns.state.functional;

public sealed interface Score
    permits Advantage, Fifteen, Forty, Lost, Love,
                                      Thirty, Won {
    Score winsRound(Score opponentsScore);
    Score losesRound(Score opponentsScore);

}
