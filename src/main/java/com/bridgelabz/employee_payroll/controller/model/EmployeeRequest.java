package com.bridgelabz.employee_payroll.controller.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
@Data
public class EmployeeRequest {
 
    @NotEmpty
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    String name;

   
    @NotEmpty(message = "Gender must not be null")
    String gender;
 
    @NotEmpty(message = "Department must not be null")
    String department;

    @NotNull
    @Min(value = 500, message="Miminum salary should more than 500")
    float salary;

    LocalDate startDate;

    @Email(message = "Email is invalid")
    String email;

    public EmployeeRequest(String name, String gender, String department, float salary, LocalDate startDate,String email) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
        this.email = email;
    }

    public EmployeeRequest() {
    }
}
