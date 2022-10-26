package com.bridgelabz.employee_payroll.controller.model;

import com.bridgelabz.employee_payroll.service.model.EmployeeDTO;

public class Mapper {
    public static EmployeeDTO ToService(EmployeeRequest employeeRequest){
        EmployeeDTO emp = new EmployeeDTO();
        emp.setName(employeeRequest.getName());
        emp.setDepartment(employeeRequest.getDepartment());
        emp.setGender(employeeRequest.getGender());
        emp.setSalary(employeeRequest.getSalary());
        emp.setStartDate(employeeRequest.getStartDate());
        return emp;
    }
    public static EmployeeResponse fromService(EmployeeDTO employeeDTO){
        EmployeeResponse emp = new EmployeeResponse();
        emp.setName(employeeDTO.getName());
        emp.setDepartment(employeeDTO.getDepartment());
        emp.setGender(employeeDTO.getGender());
        emp.setSalary(employeeDTO.getSalary());
        emp.setStartDate(employeeDTO.getStartDate());
        return emp;
    }
}
