package com.xyzcorp.javapatterns.decorator.application;

import com.xyzcorp.javapatterns.decorator.application.domain.Employee;
import com.xyzcorp.javapatterns.decorator.application.domain.EmployeeDAO;

import java.util.List;

public class MulticastDAO implements EmployeeDAO {

    private final List<EmployeeDAO> list;

    public MulticastDAO(List<EmployeeDAO> list) {
        this.list = list;
    }

    @Override
    public void addEmployee(Employee employee) {
        for (EmployeeDAO dao: list) {
            dao.addEmployee(employee);
        }
    }
}
