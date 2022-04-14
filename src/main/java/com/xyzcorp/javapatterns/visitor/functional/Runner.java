package com.xyzcorp.javapatterns.visitor.functional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        AnimalVisitor animalVisitor = animal -> switch (animal) {
            case Bear b -> b.feed(new Meat());
            case Zebra z -> z.feed(new Hay());
        };

        List<Animal> animals =
            Stream.of(new Bear(false), new Zebra(false))
                  .map(animalVisitor::visit).toList();

        System.out.println(animals);

        Function<Animal, String> convertToXML =
            animal -> switch (animal) {
                case Bear b -> "<bear/>";
                case Zebra z -> "<zebra/>";
            };

        String result =
            Stream.of(new Bear(false), new Zebra(false)).map(convertToXML)
                  .collect(Collectors.joining("\n\t", "<animal>\n\t", "\n" +
                      "</animal>"));
        System.out.println(result);
    }
}
