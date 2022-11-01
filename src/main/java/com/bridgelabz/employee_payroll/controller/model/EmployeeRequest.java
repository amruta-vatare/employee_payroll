package com.bridgelabz.employee_payroll.controller.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
public class EmployeeRequest {
 
    @NotEmpty
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    String name;
    
    @Min(value = 500, message="Miminum salary should more than 500")
    float salary;

    @Pattern(regexp = "male|female", message = "Genders need to male or felmale")
    String gender;

    @NotNull(message = "Start date should not be empty")

    @JsonFormat(pattern="yyyy-MM-dd")
    @PastOrPresent(message = "start date should be past or todays date")
    LocalDate startDate;

    @Email(message = "Email is invalid")
    String email;

    @NotBlank(message = "profile pic cannot be empty")
    String profile;

    @NotEmpty(message = "department should not be empty")
    List<String> departments;

    public EmployeeRequest(String name, String gender, float salary, LocalDate startDate,String email,String profile,List<String> departments) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.startDate = startDate;
        this.email = email;
        this.profile = profile;
        this.departments = departments;
    }

    public EmployeeRequest() {
    }
}
