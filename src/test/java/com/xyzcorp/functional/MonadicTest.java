package com.xyzcorp.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class MonadicTest {

    // The Functional Design Patterns
    // Monoid  -> append
    // Functor -> map
    // Monad   -> flatMap

    // [Harvey] map (Cat c -> c.applyCollar(collar))
    // Observable<Integer>, Flux<String>, List<Employee>, Mono<Long>, Future<Cow>,
    // Optional<Cat>, Stream<Capybara> do contain map, flatMap

    @Test
    void testFunctorInAStream() {
        List<Integer> result =
            Stream.of(1, 2, 3, 4)
                .map(x -> x * 10) //functor = map
                .collect(Collectors.toList());
        assertThat(result).contains(1, 2, 3, 4);
    }

    @Test
    void testFunctorInAStreamButChangingTheParameterizedType() {
        List<String> result =
            Stream.of(1, 2, 3, 4)
                .map(x -> String.valueOf(x * 10)) //functor = map
                .collect(Collectors.toList());
        assertThat(result).contains("10", "20", "30", "40");
    }

    //1. Has the shape of C<T>
    //2. Has a good/evil side
    //3. Has intrinsic error handling

    @Test
    void testEvilFunctorInAStream() {
        List<Integer> result =
            Stream.<Integer>empty()
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

    //var x = new C<T>
    //var y = x.flatMap(i -> C())
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

    @Test
    void testMonadsAreChainable() {
        var o1 = Optional.of(30);
        var o2 = Optional.<Integer>empty();
        var o3 = Optional.of(190);

        Optional<Integer> result =
            o1.flatMap(x ->
                o2.flatMap(y ->
                    o3.map(z -> x + y + z)));

        assertThat(result).isEqualTo(Optional.empty());
    }

}
