package com.xyzcorp.javapatterns.decorator.application.rabbitmq;

import com.xyzcorp.javapatterns.decorator.application.domain.Employee;
import com.xyzcorp.javapatterns.decorator.application.domain.EmployeeDAO;

public class RabbitMQEmployeeDAO implements EmployeeDAO {
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Added employee to an MQ");
    }
}
