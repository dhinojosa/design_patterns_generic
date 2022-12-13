package com.xyzcorp.javapatterns.composite.oracle;

import com.xyzcorp.javapatterns.composite.domain.EmployeeDAO;
import com.xyzcorp.javapatterns.composite.domain.Employee;

public class OracleEmployeeDAO implements EmployeeDAO {
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Added employee to an Oracle DB");
    }
}
