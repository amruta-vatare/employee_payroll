package com.bridgelabz.employee_payroll.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employee_payroll.advice.EmployeePayrollException;
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
        List<EmployeeData> list = repository.findAll();
        EmployeeDTO employeeDTO = Mapper.FromRepository(list.stream().filter(empData -> empData.getId() == id).findFirst().orElseThrow(()-> new EmployeePayrollException("Employee not found")));
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
       List<EmployeeData> list = repository.findAll();
       List<EmployeeDTO> employees = Mapper.FromRepository(list);
        return employees;
    }

    @Override
    public void deleteEmployee(long id) {
        EmployeeData employeeData = repository.findById(id).get();
        repository.delete(employeeData);
    }

    @Override
    public void updateEmployee(long id, EmployeeDTO employeeDto) {
        EmployeeData employeeData = repository.findById(id).get();
        employeeData.setName(employeeDto.getName());
        employeeData.setGender(employeeDto.getGender());
        employeeData.setSalary(employeeDto.getSalary());
        employeeData.setStartDate(employeeDto.getStartDate());
        employeeData.setEmail(employeeDto.getEmail());
        employeeData.setProfile(employeeDto.getProfile());
        employeeData.setDepartments(employeeDto.getDepartments());
        repository.save(employeeData);
    }
}
