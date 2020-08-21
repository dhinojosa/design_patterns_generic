package com.xyzcorp.builder;

import com.google.common.collect.ImmutableBiMap;
import com.google.errorprone.annotations.Immutable;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GuavaBuilderTest {

    @Test
    void testImmutableBiMap() {
        HashMap<String, String> anotherMap = new HashMap<>();
        anotherMap.put("Coffee", "Kapi");
        anotherMap.put("Rainbow", "Indradhanush");

        ImmutableBiMap<String, String> englishToHindi =
                ImmutableBiMap.<String, String>builder()
                        .put("Cloud", "Badal")
                        .put("Light", "Prakash")
                        .putAll(anotherMap)
                        .build();

        assertEquals("Badal", englishToHindi.get("Cloud"));

        ImmutableBiMap<String, String> hindiToEnglish = englishToHindi.inverse();

        assertEquals("Light", hindiToEnglish.get("Prakash"));
        assertEquals(englishToHindi.get("Coffee"), "Kapi");
    }
}
