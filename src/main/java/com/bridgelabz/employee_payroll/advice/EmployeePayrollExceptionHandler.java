package com.bridgelabz.employee_payroll.advice;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bridgelabz.employee_payroll.controller.model.EmployeeResponse;

import lombok.extern.slf4j.Slf4j;


@ControllerAdvice
@Slf4j
public class EmployeePayrollExceptionHandler {
    private static final String msg = "Exception while processing REST request";

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<EmployeeResponse> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception){
        log.error("Invalide Date formate", exception);
        EmployeeResponse response = new EmployeeResponse(msg,"Should have date in formate dd MMM yyyy");
        return new ResponseEntity<EmployeeResponse>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<EmployeeResponse> employeePayrollArgumentNotValidateException(MethodArgumentNotValidException exception){
        List<ObjectError> eList = exception.getBindingResult().getAllErrors();
        List<String> errorMsg = eList.stream().map(objErr ->objErr.getDefaultMessage()).collect(Collectors.toList());
        EmployeeResponse response = new EmployeeResponse(msg,errorMsg);
        return new ResponseEntity<EmployeeResponse>(response, HttpStatus.BAD_REQUEST);

    }
    
    @ExceptionHandler(EmployeePayrollException.class)
    public ResponseEntity<EmployeeResponse> handleEmployeePayrollException(EmployeePayrollException exception){
        EmployeeResponse response = new EmployeeResponse(msg,exception.getMessage());
        return new ResponseEntity<EmployeeResponse>(response, HttpStatus.BAD_REQUEST);
    }
}
