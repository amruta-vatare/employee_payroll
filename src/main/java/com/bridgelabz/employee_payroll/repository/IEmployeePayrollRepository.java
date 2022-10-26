package com.bridgelabz.employee_payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.employee_payroll.repository.model.EmployeeData;

@Repository
public interface IEmployeePayrollRepository extends JpaRepository<EmployeeData,Long> {
    
}
