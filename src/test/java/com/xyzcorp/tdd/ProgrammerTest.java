package com.xyzcorp.tdd;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public class ProgrammerTest {

    @Test
    void testBjarneFullName() {
        //first: FirstName, second: LastName, third: BirthDate, fourth: Supplier of current Date
        Programmer programmer = new Programmer("Bjarne",
                "Strousoup", LocalDate.of(1950, 12, 30),
                () -> LocalDate.of(2018, 8, 20));

        assertEquals("Bjarne Strousoup", programmer.fullName());
    }

    @Test
    void testGoslingFullName() {
        Programmer programmer = new Programmer("James",
                "Gosling", LocalDate.of(1955, 5, 19),
                () -> LocalDate.of(2018, 8, 20));
        assertEquals("James Gosling", programmer.fullName());
    }

    @Test
    void testBjarneAge() {
        Programmer programmer = new Programmer(
                "Bjarne", "Strousoup", LocalDate.of(1950, 12, 30),
                () -> LocalDate.of(2018, 8, 20));
        assertEquals(67, programmer.getAge());
    }

    //Unit test - isolated, runnable
    @Test
    void testGoslingAge() {
        Programmer programmer = new Programmer(
                "James", "Gosling", LocalDate.of(1955, 5, 19),
                () -> LocalDate.of(2018, 8, 20));
        assertEquals(63, programmer.getAge());
    }

    //Integration Test - non-isolation

    @Test
    void testGoslingWithActualDate() {
        Programmer programmer = new Programmer(
                "James", "Gosling", LocalDate.of(1955, 5, 19),
                LocalDate::now);
        assertEquals(65, programmer.getAge());
    }

    @Test
    public void testCreateProgrammerUsingAFactory() {
        Programmer programmer = ProgrammerFactory
                .create("Guido", "Van Rossum", LocalDate.of(1956, 1, 31));
        assertEquals(64, programmer.getAge());
    }
}
