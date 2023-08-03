package com.xyzcorp.javapatterns.state.functional;

public sealed interface Score permits Advantage, Fifteen, Forty, Lost, Love,
                                      Thirty, Won {
    Score wins(Score opponentsScore);
    Score loses(Score opponentsScore);
}
