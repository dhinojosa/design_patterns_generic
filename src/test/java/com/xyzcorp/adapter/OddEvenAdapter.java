package com.xyzcorp.adapter;

public class OddEvenAdapter {
    private Integer i;

    public OddEvenAdapter(Integer i) {
        this.i = i;
    }

    public boolean isOdd() {
        return i % 2 != 0;
    }
}
