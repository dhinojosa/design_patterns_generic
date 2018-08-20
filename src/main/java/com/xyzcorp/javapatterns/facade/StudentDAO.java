package com.xyzcorp.javapatterns.facade;

public interface StudentDAO {
    public Long persist(Student student);
    public Student findById(Long id);
    public boolean isAlreadyRegistered(Student student);
}
