package com.xyzcorp.javapatterns.state.functional;


public class Runner {
    public static void main(String[] args) {

        TennisGame tennisGame = TennisGame.start(new Player("Salvador"),
            new Player("Rafael"));


        TennisGame stage1 = tennisGame
            .nextTurn((sal1, rafael1) -> rafael1);

        System.out.println(stage1);

        TennisGame stage2 = stage1
            .nextTurn((sal1, rafael1) -> sal1)
            .nextTurn((sal, rafael) -> rafael)
            .nextTurn((sal, rafael) -> rafael);

        System.out.println(stage2);

        TennisGame resultGame =
            stage2
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael) //Game already won, Sal
                // fifteen, Ray Won
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael);

        System.out.println(resultGame.score());
    }
}
