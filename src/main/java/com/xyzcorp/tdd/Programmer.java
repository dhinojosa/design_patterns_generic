package com.xyzcorp.tdd;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.function.Supplier;

public class Programmer {
    private Supplier<LocalDate> supplier;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;

    public Programmer(String firstName, String lastName,
                      LocalDate birthDate,
                      Supplier<LocalDate> supplier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.supplier = supplier;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(birthDate, supplier.get());
    }
}
