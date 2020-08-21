package com.xyzcorp.fizzbuzz;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class FizzBuzz {

    public static String convert(int num) {
        if (num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println(convert(i));
        }

        Stream.iterate(1, integer -> integer + 1)
              .map(FizzBuzz::convert)
              .limit(100)
              .forEach(System.out::println);

    }
}
