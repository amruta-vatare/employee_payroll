package com.bridgelabz.employee_payroll.controller.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
@Data
public class EmployeeResponse {
    String name;
    String gender;
    float salary;
    LocalDate startDate;
    String email;
    String profile;
    List<String> departments;

    public EmployeeResponse(String name, String gender, float salary, LocalDate startDate, String email, String profile, List<String>departments) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.startDate = startDate;
        this.email = email;
        this.profile = profile;
        this.departments = departments;
    }   


    public EmployeeResponse() {
    }

    public EmployeeResponse(String string, List<String> errorMsg) {
    }


    public EmployeeResponse(String string, String message) {
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


    // @Override
    // public String toString() {
    //     return "EmployeeResponse [name=" + name + ", gender=" + gender + ", department=" + department + ", salary="
    //             + salary + ", startDate=" + startDate + ", email=" + email + "]";
    // }
    
    

}
