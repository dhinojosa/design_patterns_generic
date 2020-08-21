package com.xyzcorp.builder;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {
    @Test
    public void testPetals() {
        Flower flower =
                Flower.builder().petals(7).build();

        assertEquals(7, flower.getPetals());
    }

    @Test
    public void testLatinName() {
        Flower flower =
                Flower.builder().latinName("Narcissus").build();

        assertEquals("Narcissus", flower.getLatinName());
    }

    @Test
    public void testLatinNameAndPetals() {
        Flower flower =
                Flower.builder()
                      .latinName("Narcissus")
                      .petals(4)
                      .build();

        assertEquals("Narcissus", flower.getLatinName());
        assertEquals(4, flower.getPetals());
    }
}
