package com.xyzcorp.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalDesignPatterns {

    @Test
    void testFunctorInAStream() {
        Stream.of(1, 2, 3, 4)
              .map(x -> x * 10) //functor = map
              .collect(Collectors.toList());
    }

    @Test
    void testEvilFunctorInAStream() {
        List<Integer> result = Stream.<Integer>empty()
            .map(x -> x * 10) //functor = map
            .collect(Collectors.toList());
        System.out.println(result);
    }

    @Test
    void testFunctorInAOptional() {
        Optional<Integer> optionalInteger =
            Optional
                .of(40)
                .map(x -> x * 10);//functor = map

        System.out.println(optionalInteger);
    }

    @Test
    void testEvilFunctorInAOptional() {
        Optional<Integer> optionalInteger =
            Optional.<Integer>empty()
                .map(x -> x * 10);//functor = map

        System.out.println(optionalInteger);
    }

    @Test
    void testMonad() {
        Stream<Integer> integerStream =
            Stream.of(1, 2, 3, 4).flatMap(x -> Stream.of(-x, x, x + 1));
        System.out.println(integerStream.collect(Collectors.toList()));
    }

    @Test
    void testEvilStreamMonad() {
        Stream<Integer> integerStream =
            Stream.of(1, 2, 3, 4).flatMap(x -> Stream.empty());
        System.out.println(integerStream.collect(Collectors.toList()));
    }
}
