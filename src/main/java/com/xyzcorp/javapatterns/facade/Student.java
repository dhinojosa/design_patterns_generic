package com.xyzcorp.javapatterns.facade;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String ssn;

    public Student(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(ssn, student.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, ssn);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", ssn='").append(ssn).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
