package com.bridgelabz.employee_payroll.service.model;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.employee_payroll.repository.model.EmployeeData;

public class Mapper {
    public static EmployeeData ToRepository(EmployeeDTO employeeDTO)
    {
        EmployeeData employeeData = new EmployeeData();
        employeeData.setName(employeeDTO.getName());
        employeeData.setGender(employeeDTO.getGender());
        employeeData.setSalary(employeeDTO.getSalary());
        employeeData.setStartDate(employeeDTO.getStartDate());
        employeeData.setEmail(employeeDTO.getEmail());
        employeeData.setProfile(employeeDTO.getProfile());
        employeeData.setDepartments(employeeDTO.getDepartments());
        return employeeData;
    }

    public static EmployeeDTO FromRepository(EmployeeData employeeData)
    {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(employeeData.getName());
        employeeDTO.setGender(employeeData.getGender());
        employeeDTO.setSalary(employeeData.getSalary());
        employeeDTO.setStartDate(employeeData.getStartDate());
        employeeDTO.setEmail(employeeData.getEmail());
        employeeDTO.setProfile(employeeData.getProfile());
        employeeDTO.setDepartments(employeeData.getDepartments());
        return employeeDTO;
    }
    
    public static List<EmployeeDTO> FromRepository(List<EmployeeData> employeeList)
    {
        List<EmployeeDTO> employees = new ArrayList<>();
        for (EmployeeData employeeData : employeeList) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setName(employeeData.getName());
            employeeDTO.setGender(employeeData.getGender());
            employeeDTO.setSalary(employeeData.getSalary());
            employeeDTO.setStartDate(employeeData.getStartDate());
            employeeDTO.setEmail(employeeData.getEmail());
            employeeDTO.setProfile(employeeData.getProfile());
            employeeDTO.setDepartments(employeeData.getDepartments());
            employees.add(employeeDTO);
        }
        return employees;
    }
}
