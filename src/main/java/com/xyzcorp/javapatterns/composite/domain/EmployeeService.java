package com.xyzcorp.javapatterns.composite.domain;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void hireNewEmployee(Employee employee) {
        this.employeeDAO.addEmployee(employee);
    }
}
