package com.bridgelabz.employee_payroll.repository.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name = "EMPLOYEE")
public class EmployeeData {
    @Id
    @GeneratedValue
    int id;
    @Column(name = "NAME")
    String name;
    @Column(name = "GENDER")
    String gender;
    @Column(name = "DEPT")
    String department;
    @Column(name = "SALARY")
    float salary;
    @Column(name = "START_DATE")
    LocalDate startDate;

    public EmployeeData(int id,String name, String gender, String department, float salary, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
    }

    public EmployeeData() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    @Override
    public String toString() {
        return "Employee name=" + name + ",\n gender=" + gender + ",\n department=" + department + ", \nsalary=" + salary
                + ",\n startDate=" + startDate + " ";
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    

}
