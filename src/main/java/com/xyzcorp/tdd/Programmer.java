package com.xyzcorp.tdd;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

public class Programmer {
    private final Supplier<LocalDate> supplier;
    private final LocalDate birthDate;
    private final String firstName;
    private final String lastName;

    protected Programmer(String firstName, String lastName,
                      LocalDate birthDate,
                      Supplier<LocalDate> supplier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.supplier = supplier;
    }

    //end users over here
    //Factory Pattern
    //Create Complex Objects
    public static Programmer of(String firstName, String lastName, LocalDate birthDate) {
        return new Programmer(firstName, lastName, birthDate,
            LocalDate::now);
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(birthDate, supplier.get());
    }
}
