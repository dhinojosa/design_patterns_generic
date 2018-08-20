package com.xyzcorp.javapatterns.facade;

public class StandardStudentService implements StudentService {

    private final StudentDAO studentDAO;

    public StandardStudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void registerStudent(Student student) {
        if (!studentDAO.isAlreadyRegistered(student)) {
            studentDAO.persist(student);
        }
    }
}
