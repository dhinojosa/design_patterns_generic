package com.xyzcorp.javapatterns.chainresponsibility.functional;

import java.util.Optional;

public interface Reviewer {
    Optional<String> review(Car car);
}
