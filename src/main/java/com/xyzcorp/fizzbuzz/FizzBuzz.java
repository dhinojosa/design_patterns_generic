package com.xyzcorp.fizzbuzz;

public class FizzBuzz {
    public static String convert(int i) {
        if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
        else if (i % 3 == 0) return "Fizz";
        else if (i % 5 == 0) return "Buzz";
        else return String.valueOf(i);
    }

    //cyber-dojo.org
    //CMD+SHIFT+T
    //CTRL+SHIFT+T
}
