package com.bridgelabz.employee_payroll.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bridgelabz.employee_payroll.repository.model.EmployeeData;

@Repository
public interface IEmployeePayrollRepository extends JpaRepository<EmployeeData,Long> {
    @Query(value = "select * from employee,employee_department where employee_id = id and departments =:department",nativeQuery = true)
    List<EmployeeData> findEmployeesByDepartments(@Param("department") String department);
}
