package com.xyzcorp.adapter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddEvenAdapterTest {

    @Test
    void testIsOdd() {
        Integer i = 400;
        OddEvenAdapter oddEvenAdapter = new OddEvenAdapter(i);
        boolean isOdd = oddEvenAdapter.isOdd();
        assertThat(isOdd).isFalse();
    }
}
