package com.xyzcorp.javapatterns.iterator;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class IteratorTest {

    @Test
    public void testIteratorFromList() {
        List<String> stringList = Arrays.asList("Foo", "Bar", "Baz", "Qux", "Quux");
        Iterator<String> iterator = stringList.iterator();

        String value1 = iterator.next();
        String value2 = iterator.next();

        assertEquals(value1, "Foo");
        assertEquals(value2, "Bar");
    }

    @Test
    public void testIteratorFromListTrickQuestion() {
        List<String> stringList = Arrays.asList("Foo", "Bar", "Baz", "Qux", "Quux");
        String value1 = stringList.iterator().next();
        String value2 = stringList.iterator().next();

        assertEquals(value1, "Foo");
        assertEquals(value2, "Foo");
    }

    @Test
    public void testIteratorUsingWhileLoop() {
        Iterator<String> iterator = Arrays.asList("Foo", "Bar", "Baz", "Qux", "Quux").iterator();
        List<String> result = new ArrayList<String>();
        while(iterator.hasNext()) {
            result.add(iterator.next());
        }
        assertEquals("[Foo, Bar, Baz, Qux, Quux]",result.toString());
    }

    @SuppressWarnings("UseBulkOperation")
    @Test
    public void testIteratorWithEnhancedForLoop() {
        List<String> list = Arrays.asList("Foo", "Bar", "Baz", "Qux", "Quux");
        List<String> result = new ArrayList<String>();
        for (String s : list) {
            result.add(s);
        }
        assertEquals("[Foo, Bar, Baz, Qux, Quux]",result.toString());
    }

    @Test
    public void testListIteratorLoop() {
        List<String>  list = Arrays.asList("Foo", "Bar", "Baz", "Qux", "Quux");
        ListIterator<String> listIterator = list.listIterator();
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
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        ListIterator<String> listIterator = list.listIterator();
        listIterator.next(); //One
        listIterator.next(); //Two
        listIterator.add("Nice");
        String afterAdd = listIterator.next(); //Three
        assertEquals("Three", afterAdd);
        listIterator.previous(); //Three
        listIterator.previous(); //Nice
        listIterator.next(); //Two
        assertEquals("Three", listIterator.next());
        assertEquals(list, Arrays.asList("One", "Two", "Nice", "Three", "Four"));
    }

    @Test
    public void testSpliteratorWithForEachRemaining() {
        List<Integer> list = IntStream.range(1, 1000).boxed().collect(Collectors.toList());
        Spliterator<Integer> split1 = list.spliterator();
        Spliterator<Integer> split2 = split1.trySplit();
        Spliterator<Integer> split3 = split2.trySplit();
        Spliterator<Integer> split4;
        split4 = split1.trySplit();
        split1.forEachRemaining(x -> System.out.println("S1 " + x));
        split2.forEachRemaining(x -> System.out.println("S2 " + x));
        split3.forEachRemaining(x -> System.out.println("S3 " + x));
        split4.forEachRemaining(x -> System.out.println("S4 " + x));
    }

    @Test
    public void testSpliteratorWithTryAdvance() {
        List<String> list = Arrays.asList("Foo", "Bar", "Baz", "Qux", "Quux");
        Spliterator<String> split1 = list.spliterator();
        Spliterator<String> split2 = split1.trySplit();
        split1.tryAdvance(x -> System.out.println("S1 " + x)); //Baz
        split2.tryAdvance(x -> System.out.println("S2 " + x)); //Foo
    }
}
