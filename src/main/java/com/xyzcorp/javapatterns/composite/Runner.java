package com.xyzcorp.javapatterns.composite;

import com.xyzcorp.javapatterns.composite.domain.Employee;
import com.xyzcorp.javapatterns.composite.domain.EmployeeService;
import com.xyzcorp.javapatterns.composite.oracle.OracleEmployeeDAO;
import com.xyzcorp.javapatterns.composite.rabbitmq.RabbitMQEmployeeDAO;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CompositeDAO compositeDAO = new CompositeDAO(List.of(new OracleEmployeeDAO(), new RabbitMQEmployeeDAO()));
        EmployeeService employeeService = new EmployeeService(compositeDAO);
        employeeService.hireNewEmployee(new Employee("301-390", "Todd", "Bowerbank"));
    }
}
