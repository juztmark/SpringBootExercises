package com.appslab.springbootapp.service;

import com.appslab.springbootapp.model.Employee;
import com.appslab.springbootapp.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void saveEmployees(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }

    @Override
    public Optional<Employee> findById(long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public float getTotalSalary(List<Employee> list) {
        return (float) list.stream().mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public int getTotalBonus(List<Employee> list) {
        return list.stream().mapToInt(Employee::getBonus).sum();
    }
}
