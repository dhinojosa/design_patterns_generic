package com.xyzcorp.javapatterns.iterator;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class IteratorTest {

    @Test
    public void testIteratorFromList() {
        var stringList = List.of("Foo", "Bar", "Baz", "Qux", "Quux");
        Iterator<String> iterator = stringList.iterator();

        String value1 = iterator.next();
        String value2 = iterator.next();

        assertEquals(value1, "Foo");
        assertEquals(value2, "Bar");
    }

    @Test
    public void testIteratorFromListTrickQuestion() {
        var stringList = List.of("Foo", "Bar", "Baz", "Qux", "Quux");
        String value1 = stringList.iterator().next();
        String value2 = stringList.iterator().next();

        assertEquals(value1, "Foo");
        assertEquals(value2, "Foo");
    }

    @Test
    public void testIteratorUsingWhileLoop() {
        var iterator = List.of("Foo", "Bar", "Baz", "Qux", "Quux").iterator();
        var result = new ArrayList<String>();
        while(iterator.hasNext()) {
            result.add(iterator.next());
        }
        assertEquals("[Foo, Bar, Baz, Qux, Quux]",result.toString());
    }

    @SuppressWarnings("UseBulkOperation")
    @Test
    public void testIteratorWithEnhancedForLoop() {
        var list = List.of("Foo", "Bar", "Baz", "Qux", "Quux");
        var result = new ArrayList<String>();
        for (String s : list) {
            result.add(s);
        }
        assertEquals("[Foo, Bar, Baz, Qux, Quux]",result.toString());
    }

    @Test
    public void testListIteratorLoop() {
        var list = List.of("Foo", "Bar", "Baz", "Qux", "Quux");
        var listIterator = list.listIterator();
        listIterator.next();
        listIterator.next();
        listIterator.next();
        //listIterator.add("Nice"); Unsupported

        listIterator.previous();
        listIterator.previous();
        listIterator.next();
        assertEquals(listIterator.next(), "Baz");
    }


    @Test
    public void testListIteratorLoopWithModification() {
        var list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        var listIterator = list.listIterator();
        listIterator.next(); //One
        listIterator.next(); //Two
        listIterator.add("Nice");
        String afterAdd = listIterator.next(); //Three
        assertEquals("Three", afterAdd);
        listIterator.previous(); //Three
        listIterator.previous(); //Nice
        listIterator.next(); //Two
        assertEquals("Three", listIterator.next());
        assertEquals(list, List.of("One", "Two", "Nice", "Three", "Four"));
    }

    @Test
    public void testSpliteratorWithForEachRemaining() {
        var list = IntStream.range(1, 1000).boxed().collect(Collectors.toList());
        var split1 = list.spliterator();
        var split2 = split1.trySplit();
        var split3 = split2.trySplit();
        var split4 = split1.trySplit();
        split1.forEachRemaining(x -> System.out.println("S1 " + x));
        split2.forEachRemaining(x -> System.out.println("S2 " + x));
        split3.forEachRemaining(x -> System.out.println("S3 " + x));
        split4.forEachRemaining(x -> System.out.println("S4 " + x));
    }

    @Test
    public void testSpliteratorWithTryAdvance() {
        var list = List.of("Foo", "Bar", "Baz", "Qux", "Quux");
        var split1 = list.spliterator();
        var split2 = split1.trySplit();
        split1.tryAdvance(x -> System.out.println("S1 " + x)); //Baz
        split2.tryAdvance(x -> System.out.println("S2 " + x)); //Foo
    }
}
