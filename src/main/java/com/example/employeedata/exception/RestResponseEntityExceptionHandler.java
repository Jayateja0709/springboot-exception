package com.example.employeedata.exception;

import com.example.employeedata.entity.Employee;
import com.example.employeedata.entity.ErrorResponse1;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Object> handleEmployeeServiceException(EmployeeServiceCustomException exception){

        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);

    }

}
