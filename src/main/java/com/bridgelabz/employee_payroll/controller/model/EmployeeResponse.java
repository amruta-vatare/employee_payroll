package com.bridgelabz.employee_payroll.controller.model;

import java.time.LocalDate;

public class EmployeeResponse {
    String name;
    String gender;
    String department;
    float salary;
    LocalDate startDate;

    public EmployeeResponse(String name, String gender, String department, float salary, LocalDate startDate) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
    }

    public EmployeeResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [name=" + name + ", gender=" + gender + ", department=" + department + ", salary=" + salary
                + ", startDate=" + startDate + "]";
    }
}
