package com.xyzcorp.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionalConstructTest {

    // The Functional Design Patterns
    // Monoid  -> append
    // Functor -> map
    // Monad   -> flatMap

    // [Harvey] map (Cat c -> c.applyCollar(collar))
    // Observable[Integer], Flux[String], List[Employee], Future[Cow],
    // Optional[Cat], Stream[Capybara] do contain map, flatMap

    @Test
    void testFunctorInAStream() {
        List<Integer> result =
                Stream.of(1, 2, 3, 4)
                      .map(x -> x * 10) //functor = map
                      .collect(Collectors.toList());
        assertThat(result).contains(1,2,3,4);
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
                Stream.of(1, 2, 3, 4)
                      .flatMap(x -> Stream.of(-x, x, x + 1));
        System.out.println(integerStream.collect(Collectors.toList()));
    }

    @Test
    void testEvilStreamMonad() {
        Stream<Integer> integerStream =
                Stream.of(1, 2, 3, 4).flatMap(x -> Stream.empty());
        System.out.println(integerStream.collect(Collectors.toList()));
    }

    @Test
    void testSkippingBadStuff() {
        Stream<Integer> integerStream = Stream.of(10, 1, 20, 0, 5, 25);
        Stream<Integer> mappedStream = integerStream.flatMap(x -> {
            try {
                return Stream.of(100 / x);
            } catch (ArithmeticException ae) {
                return Stream.empty();
            }
        });

        List<Integer> result = mappedStream.collect(Collectors.toList());
        assertThat(result).isEqualTo(List.of(10, 100, 5, 20, 4));
    }
}
