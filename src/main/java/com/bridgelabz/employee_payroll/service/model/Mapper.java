package com.bridgelabz.employee_payroll.service.model;

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
        return employeeData;
    }
}
