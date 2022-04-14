package com.xyzcorp.javapatterns.strategy.functional;


import java.util.Optional;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        Optional<Integer> sum =
            Stream.of(1, 2, 3, 4).reduce(Integer::sum);
        Optional<Integer> product =
            Stream.of(1, 2, 3, 4).reduce((total, next) -> total * next);

        System.out.println(sum);
        System.out.println(product);
    }
}
