package com.appslab.springbootapp.model;

public class Driver extends Employee {
    public Driver(long companyId, float salary, int bonus) {
        super(companyId, salary, bonus, EmployeeType.DRIVER);
    }
}
