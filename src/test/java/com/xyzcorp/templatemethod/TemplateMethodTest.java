package com.xyzcorp.templatemethod;

import org.junit.jupiter.api.Test;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateMethodTest {

    @Test
    void testFunctionCompose() {
        Function<Object, String> g = o -> o.toString();
        Function<String, Integer> f = s -> s.length();

        Function<Object, Integer> fgx = f.compose(g);

        assertEquals(Integer.valueOf(12), fgx.apply("Hello, There"));
    }

    @Test
    void testFunctionAndThen() {
        Function<Object, String> g = o -> o.toString();
        Function<String, Integer> f = s -> s.length();

        Function<Object, Integer> fgx = g.andThen(f);

        assertEquals(Integer.valueOf(12), fgx.apply("Hello, There"));
    }
}
