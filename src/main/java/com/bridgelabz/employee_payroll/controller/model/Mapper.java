package com.bridgelabz.employee_payroll.controller.model;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.employee_payroll.service.model.EmployeeDTO;

public class Mapper {
    public static EmployeeDTO ToService(EmployeeRequest employeeRequest){
        EmployeeDTO emp = new EmployeeDTO();
        emp.setName(employeeRequest.getName());
        emp.setGender(employeeRequest.getGender());
        emp.setSalary(employeeRequest.getSalary());
        emp.setStartDate(employeeRequest.getStartDate());
        emp.setEmail(employeeRequest.getEmail());
        emp.setProfile(employeeRequest.getProfile());
        emp.setDepartments(employeeRequest.getDepartments());
        return emp;
    }
    public static EmployeeResponse fromService(EmployeeDTO employeeDTO){
        EmployeeResponse emp = new EmployeeResponse();
        emp.setName(employeeDTO.getName());
        emp.setGender(employeeDTO.getGender());
        emp.setSalary(employeeDTO.getSalary());
        emp.setStartDate(employeeDTO.getStartDate());
        emp.setEmail(employeeDTO.getEmail());
        emp.setProfile(employeeDTO.getProfile());
        emp.setDepartments(employeeDTO.getDepartments());
        return emp;
    }
    public static List<EmployeeResponse> fromService(List<EmployeeDTO> employeeDTOs){
        List<EmployeeResponse> responses =  new ArrayList<>();
        for (EmployeeDTO employeeDTO : employeeDTOs) {
            EmployeeResponse emp = fromService(employeeDTO);
        responses.add(emp);
        }
        
        return responses;
    }
}
