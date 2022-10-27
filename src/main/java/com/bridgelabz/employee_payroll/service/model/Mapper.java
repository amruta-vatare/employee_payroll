package com.bridgelabz.employee_payroll.service.model;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.employee_payroll.repository.model.EmployeeData;

public class Mapper {
    public static EmployeeData ToRepository(EmployeeDTO employeeDTO)
    {
        EmployeeData employeeData = new EmployeeData();
        employeeData.setName(employeeDTO.getName());
        employeeData.setDepartment(employeeDTO.getDepartment());
        employeeData.setGender(employeeDTO.getGender());
        employeeData.setSalary(employeeDTO.getSalary());
        employeeData.setStartDate(employeeDTO.getStartDate());
        employeeData.setEmail(employeeDTO.getEmail());
        return employeeData;
    }

    public static EmployeeDTO FromRepository(EmployeeData employeeData)
    {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(employeeData.getName());
        employeeDTO.setDepartment(employeeData.getDepartment());
        employeeDTO.setGender(employeeData.getGender());
        employeeDTO.setSalary(employeeData.getSalary());
        employeeDTO.setStartDate(employeeData.getStartDate());
        employeeDTO.setEmail(employeeData.getEmail());
        return employeeDTO;
    }
    
    public static List<EmployeeDTO> FromRepository(List<EmployeeData> employeeList)
    {
        List<EmployeeDTO> employees = new ArrayList<>();
        for (EmployeeData employeeData : employeeList) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setName(employeeData.getName());
            employeeDTO.setDepartment(employeeData.getDepartment());
            employeeDTO.setGender(employeeData.getGender());
            employeeDTO.setSalary(employeeData.getSalary());
            employeeDTO.setStartDate(employeeData.getStartDate());
            employeeDTO.setEmail(employeeData.getEmail());
            employees.add(employeeDTO);
        }
        return employees;
    }
}
