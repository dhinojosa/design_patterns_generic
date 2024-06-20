package com.xyzcorp.javapatterns.composite;

import com.xyzcorp.javapatterns.composite.domain.Employee;
import com.xyzcorp.javapatterns.composite.domain.EmployeeDAO;

import java.util.List;

public class CompositeDAO implements EmployeeDAO {

    private final List<EmployeeDAO> list;

    public CompositeDAO(List<EmployeeDAO> list) {
        this.list = list;
    }

    @Override
    public void addEmployee(Employee employee) {
        for (EmployeeDAO dao: list) {
            dao.addEmployee(employee);
        }
    }
}
