package com.xyzcorp.javapatterns.builder.custom;

import java.util.function.Function;

/*
 * Currying is a functional form of a builder pattern
 * "Make down payments" on the parameters to build a component
 */
public class Currying {
    public static void main(String[] args) {

        Function<Integer, Function<String, IS>> curry =
            (integer -> string -> new IS(integer, string));

        IS is = curry.apply(14).apply("Hello");

        Function<String, IS> stringISFunction = curry.apply(10);
        System.out.println(is);
    }
}
