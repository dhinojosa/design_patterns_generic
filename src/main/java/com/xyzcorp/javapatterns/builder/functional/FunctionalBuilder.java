package com.xyzcorp.javapatterns.builder.functional;

import java.util.function.Function;

public class FunctionalBuilder {
    public static void main(String[] args) {
        record Person(String firstName, String middleName, String lastName) {}

        Function<String, Function<String, Function<String, Person>>> f =
            (String firstName) -> (String middleName) ->
                (String lastName) -> new Person(firstName, middleName, lastName);

        Function<String, Function<String, Person>> afterApplyingFirstName = f.apply("Thomas");
        Function<String, Person> afterApplyingMiddleName = afterApplyingFirstName.apply("Falco");
        Person person = afterApplyingMiddleName.apply("Dolby");

        System.out.println(person);
    }
}
