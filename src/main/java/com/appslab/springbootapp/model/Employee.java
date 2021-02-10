package com.appslab.springbootapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    private float salary;
    private int bonus;

    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JoinColumn(name = "company_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Company company;

    @Column(name = "company_id")
    private long companyId;

    @ManyToMany(mappedBy = "employees", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Course> courses = new HashSet<>();

    public Employee(long companyId, float salary, int bonus, EmployeeType employeeType) {
        this.companyId = companyId;
        this.salary = salary;
        this.bonus = bonus;
        this.employeeType = employeeType;
    }

    protected Employee() {
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public String getInfo() {
        return String.format("%s’s salary is %s and bonus is %d", employeeType.name, salary, bonus);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public EmployeeType getJobType() {
        return employeeType;
    }

    public void setJobType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }
}
