package com.appslab.springbootapp.model;

public class Teacher extends Employee {
    public Teacher(long companyId, float salary, int bonus) {
        super(companyId, salary, bonus, EmployeeType.TEACHER);
    }
}
