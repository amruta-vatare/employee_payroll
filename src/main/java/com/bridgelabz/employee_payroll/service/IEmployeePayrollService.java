package com.bridgelabz.employee_payroll.service;
import java.util.List;

import com.bridgelabz.employee_payroll.service.model.EmployeeDTO;

public interface IEmployeePayrollService {
    void addEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO getEmployee(long id);
    List<EmployeeDTO> getAllEmployee();
    void deleteEmployee(long id);
    void updateEmployee(long id, EmployeeDTO employeeDto);    
}
