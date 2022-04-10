package com.xyzcorp.javapatterns.decorator.application.domain;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void hireNewEmployee(Employee employee) {
        this.employeeDAO.addEmployee(employee);
    }
}
