package com.appslab.springbootapp.service;

import com.appslab.springbootapp.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    float getTotalSalary(List<Employee> list);

    int getTotalBonus(List<Employee> list);

    void saveEmployee(Employee employees);

    void saveEmployees(List<Employee> employees);

    Optional<Employee> findById(long id);
}
