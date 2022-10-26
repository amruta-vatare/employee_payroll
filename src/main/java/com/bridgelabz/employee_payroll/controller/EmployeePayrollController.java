package com.bridgelabz.employee_payroll.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgelabz.employee_payroll.controller.model.EmployeeRequest;
import com.bridgelabz.employee_payroll.controller.model.Mapper;
import com.bridgelabz.employee_payroll.service.IEmployeePayrollService;
import com.bridgelabz.employee_payroll.service.model.EmployeeDTO;



@RequestMapping("/emp")
@Controller
public class EmployeePayrollController {
    
    @Autowired
    IEmployeePayrollService service;
    
    @PostMapping("/add")
    public ResponseEntity<String> addEmployee(@RequestBody EmployeeRequest employeeRequest){
        EmployeeDTO dto = Mapper.ToService(employeeRequest);
        service.addEmployee(dto);        
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("New employee was added successfully. (CODE 201)\n");
    }
}