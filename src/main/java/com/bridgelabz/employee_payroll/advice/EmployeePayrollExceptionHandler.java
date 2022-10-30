package com.bridgelabz.employee_payroll.advice;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bridgelabz.employee_payroll.controller.model.EmployeeResponse;


@ControllerAdvice
public class EmployeePayrollExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<EmployeeResponse> employeePayrollArgumentNotValidateException(MethodArgumentNotValidException exception){
        List<ObjectError> eList = exception.getBindingResult().getAllErrors();
        List<String> errorMsg = eList.stream().map(objErr ->objErr.getDefaultMessage()).collect(Collectors.toList());
        EmployeeResponse response = new EmployeeResponse("Exception while processing REST request",errorMsg);
        return new ResponseEntity<EmployeeResponse>(response, HttpStatus.BAD_REQUEST);

    }
    
    @ExceptionHandler(EmployeePayrollException.class)
    public ResponseEntity<EmployeeResponse> handleEmployeePayrollException(EmployeePayrollException exception){
        EmployeeResponse response = new EmployeeResponse("Exception while processing the REST request",exception.getMessage());
        return new ResponseEntity<EmployeeResponse>(response, HttpStatus.BAD_REQUEST);
    }
}
