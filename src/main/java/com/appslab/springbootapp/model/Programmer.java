package com.appslab.springbootapp.model;

public class Programmer extends Employee {
    public Programmer(long companyId, float salary, int bonus) {
        super(companyId, salary, bonus, EmployeeType.PROGRAMMER);
    }

    public String getInfo() {
        return String.format("%s’s salary is %s ", getJobType(), getSalary() + getBonus());
    }
}
