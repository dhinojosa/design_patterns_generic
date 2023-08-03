package com.xyzcorp.javapatterns.state.functional;


public class Runner {
    public static void main(String[] args) {

        TennisGame tennisGame = TennisGame.start(new Player("Salvador"),
            new Player("Rafael"));


        TennisGame state1 = tennisGame
            .nextTurn((sal1, rafael1) -> rafael1)
            .nextTurn((sal1, rafael1) -> sal1)
            .nextTurn((sal, rafael) -> rafael);


        TennisGame state2 = state1
            .nextTurn((sal, rafael) -> rafael)
            .nextTurn((sal, rafael) -> sal)
            .nextTurn((sal, rafael) -> rafael);


        TennisGame resultGame =
            state2 //Game already won, Sal fifteen, Ray Won
                   .nextTurn((sal, rafael) -> sal)
                   .nextTurn((sal, rafael) -> rafael);

        System.out.println(state1.score());
        System.out.println(state2.score());
        System.out.println(resultGame.score());
    }
}
