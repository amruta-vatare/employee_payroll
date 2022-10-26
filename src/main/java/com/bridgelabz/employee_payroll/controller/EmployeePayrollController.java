package com.bridgelabz.employee_payroll.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgelabz.employee_payroll.controller.model.EmployeeRequest;
import com.bridgelabz.employee_payroll.controller.model.EmployeeResponse;
import com.bridgelabz.employee_payroll.controller.model.Mapper;
import com.bridgelabz.employee_payroll.service.IEmployeePayrollService;
import com.bridgelabz.employee_payroll.service.model.EmployeeDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




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

    @GetMapping("get/{id}")
    public ResponseEntity<EmployeeResponse> getEmployee(@PathVariable long id) {
        EmployeeDTO employeeDto =  service.getEmployee(id);
        EmployeeResponse employeeResponse =   Mapper.fromService(employeeDto);
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(employeeResponse);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeResponse>> getAllEmployee() {
        List<EmployeeDTO> employeeDto =  service.getAllEmployee();
        List<EmployeeResponse> employeeResponses =  Mapper.fromService(employeeDto);
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(employeeResponses);
    }
    
    @DeleteMapping("remove/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable long id) {
       service.deleteEmployee(id);
        return ResponseEntity
            .status(HttpStatus.OK)
            .body("Employee was deleted successfully. (CODE 201)\n");
    }

    @PutMapping("edit/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable long id,@RequestBody EmployeeRequest employeeRequest) {
        EmployeeDTO employeeDto = Mapper.ToService(employeeRequest);
       service.updateEmployee(id,employeeDto);
        return ResponseEntity
            .status(HttpStatus.OK)
            .body("Employee was deleted successfully. (CODE 201)\n");
    }
}