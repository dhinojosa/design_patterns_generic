package com.xyzcorp.javapatterns.builder.custom;

import java.util.Objects;
import java.util.StringJoiner;

public class IS {
    private Integer number;
    private String string;

    public IS(Integer number, String string) {
        this.number = number;
        this.string = string;
    }

    public Integer getNumber() {
        return number;
    }

    public String getString() {
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IS is = (IS) o;
        return Objects.equals(number, is.number) && Objects.equals(string,
            is.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, string);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", IS.class.getSimpleName() + "[", "]")
            .add("number=" + number)
            .add("string='" + string + "'")
            .toString();
    }
}
