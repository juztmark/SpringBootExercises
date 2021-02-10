package com.appslab.springbootapp.model;

public enum EmployeeType {
    DRIVER("Driver"),
    TEACHER("Teacher"),
    PROGRAMMER("Programmer");

    public final String name;

    EmployeeType(String name) {
        this.name = name;
    }
}
