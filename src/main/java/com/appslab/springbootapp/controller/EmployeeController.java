package com.appslab.springbootapp.controller;

import com.appslab.springbootapp.model.Course;
import com.appslab.springbootapp.model.Employee;
import com.appslab.springbootapp.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;
    List<Employee> list = new ArrayList<>();

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/salary")
    public float salary() {
        return this.employeeService.getTotalSalary(list);
    }

    @GetMapping("/bonus")
    public int bonus() {
        return this.employeeService.getTotalBonus(list);
    }

    @PostMapping("addEmployee")
    public void addEmployee(@RequestBody @Valid Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @PostMapping("addEmployees")
    public void addEmployees(@RequestBody @Valid List<Employee> employees) {
        employeeService.saveEmployees(employees);
    }

    @PostMapping
    public void addCourse(@RequestBody long employeeId, @RequestBody @Valid Course course) {
        var value = employeeService.findById(employeeId);
        value.ifPresent(employee -> {
            employee.getCourses().add(course);
            course.getEmployees().add(employee);
            employeeService.saveEmployee(employee);
        });
    }
}
