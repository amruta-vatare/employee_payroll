package com.bridgelabz.employee_payroll.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employee_payroll.controller.model.EmployeeRequest;
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

    @Override
    public EmployeeDTO getEmployee(long id) {
        EmployeeData empData  = repository.findById(id).get();
        EmployeeDTO employeeDTO = Mapper.FromRepository(empData);
        return employeeDTO;
    }
}
