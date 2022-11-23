package com.bridgelabz.employee_payroll.service.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
@Data
public class EmployeeDTO {
    String name;
    String gender;
    float salary;
    LocalDate startDate;
    String email;
    String profile;
    List<String>departments;
    long id;

    public EmployeeDTO(String name, String gender, float salary, LocalDate startDate, String email, String profile, List<String> departments, long id) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.startDate = startDate;
        this.email = email;
        this.profile = profile;
        this.departments = departments;
        this.id = id;
    }

    public EmployeeDTO() {
    }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getGender() {
    //     return gender;
    // }

    // public void setGender(String gender) {
    //     this.gender = gender;
    // }

    // public String getDepartment() {
    //     return department;
    // }

    // public void setDepartment(String department) {
    //     this.department = department;
    // }

    // public float getSalary() {
    //     return salary;
    // }

    // public void setSalary(float salary) {
    //     this.salary = salary;
    // }

    // public LocalDate getStartDate() {
    //     return startDate;
    // }

    // public void setStartDate(LocalDate startDate) {
    //     this.startDate = startDate;
    // }

    // public String getEmail() {
    //     return email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    
}

