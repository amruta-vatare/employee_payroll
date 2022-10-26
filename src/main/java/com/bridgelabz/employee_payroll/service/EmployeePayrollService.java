package com.bridgelabz.employee_payroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employee_payroll.repository.IEmployeePayrollRepository;
import com.bridgelabz.employee_payroll.repository.model.EmployeeData;
import com.bridgelabz.employee_payroll.service.model.EmployeeDTO;
import com.bridgelabz.employee_payroll.service.model.Mapper;
@Service
public class EmployeePayrollService implements IEmployeePayrollService
{
    @Autowired
    IEmployeePayrollRepository repository;

    @Override
    public void addEmployee(EmployeeDTO employeeDTO) {
        EmployeeData employeeData = Mapper.ToRepository(employeeDTO);
        repository.save(employeeData);        
    }
}
