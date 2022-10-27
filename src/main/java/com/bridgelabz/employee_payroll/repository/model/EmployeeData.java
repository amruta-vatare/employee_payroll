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
    long id;
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
    @Column(name="EMAILID")
    String email;

    public EmployeeData(int id,String name, String gender, String department, float salary, LocalDate startDate,String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
        this.email = email;
    }

    public EmployeeData() {
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    

}
