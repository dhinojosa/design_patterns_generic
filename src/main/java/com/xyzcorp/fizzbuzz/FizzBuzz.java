package com.xyzcorp.fizzbuzz;

public class FizzBuzz {
    public static String apply(int i) {
        if (i < 0) throw new IllegalArgumentException("FizzBuzz can only be applied to positive numbers");
        if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
        else if (i % 5 == 0) return "Buzz";
        else if (i % 3 == 0) return "Fizz";
        else return String.valueOf(i);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(FizzBuzz.apply(i));
        }
    }
}
