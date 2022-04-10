package com.xyzcorp.javapatterns.decorator.application.oracle;

import com.xyzcorp.javapatterns.decorator.application.domain.Employee;
import com.xyzcorp.javapatterns.decorator.application.domain.EmployeeDAO;

public class OracleEmployeeDAO implements EmployeeDAO {
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Added employee to an Oracle DB");
    }
}
