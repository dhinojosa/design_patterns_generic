package com.xyzcorp.javapatterns.facade;

public class OracleStudentDAO implements StudentDAO {
    @Override
    public Long persist(Student student) {
        return null;
    }

    @Override
    public Student findById(Long id) {
      return null;
    }

    @Override
    public boolean isAlreadyRegistered(Student student) {
      return false;
    }
}
