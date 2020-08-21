package com.xyzcorp.fizzbuzz;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testConvertOf1() {
        String result = FizzBuzz.convert(1);
        assertEquals("1", result);
    }

    @Test
    public void testConvertOf2() {
        String result = FizzBuzz.convert(2);
        assertEquals("2", result);
    }

    @Test
    public void testConvertOf3() {
        String result = FizzBuzz.convert(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void testConvertOf5() {
        String result = FizzBuzz.convert(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void testConvertOf6() {
        String result = FizzBuzz.convert(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void testConvertOf10() {
        String result = FizzBuzz.convert(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void testConvertOf15() {
        String result = FizzBuzz.convert(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testConvertOf30() {
        String result = FizzBuzz.convert(30);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testConvertOfNeg1() {
        String result = FizzBuzz.convert(-1);
        assertEquals("-1", result);
    }
}
