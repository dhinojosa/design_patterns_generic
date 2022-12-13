package com.xyzcorp.javapatterns.composite.rabbitmq;

import com.xyzcorp.javapatterns.composite.domain.Employee;
import com.xyzcorp.javapatterns.composite.domain.EmployeeDAO;

public class RabbitMQEmployeeDAO implements EmployeeDAO {
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Added employee to an MQ");
    }
}
