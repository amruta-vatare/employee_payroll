package com.bridgelabz.employee_payroll.service;
import com.bridgelabz.employee_payroll.service.model.EmployeeDTO;

public interface IEmployeePayrollService {
    void addEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO getEmployee(long id);    
}
