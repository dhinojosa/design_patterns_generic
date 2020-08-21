package com.xyzcorp.fizzbuzz;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FizzBuzzTest {

    @Test
    void testOne() {
        //Think about the design
        String result = FizzBuzz.apply(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void testTwo() {
        String result = FizzBuzz.apply(2);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void testThree() {
        String result = FizzBuzz.apply(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void testFive() {
        String result = FizzBuzz.apply(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void testFifteen() {
        String result = FizzBuzz.apply(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void testThirty() {
        String result = FizzBuzz.apply(30);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void testNegativeNumber() {
        assertThatThrownBy(() -> FizzBuzz.apply(-1))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("FizzBuzz can only be applied to positive numbers");
    }
}
