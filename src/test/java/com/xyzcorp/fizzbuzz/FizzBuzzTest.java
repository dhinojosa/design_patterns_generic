package com.xyzcorp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void test1() {
        //How is it going to look?
        //Static method? State?
        String result = FizzBuzz.convert(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void test2() {
        //How is it going to look?
        //Static method? State?
        String result = FizzBuzz.convert(2);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void test3() {
        //How is it going to look?
        //Static method? State?
        String result = FizzBuzz.convert(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void test5() {
        String result = FizzBuzz.convert(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void test15() {
        String result = FizzBuzz.convert(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
