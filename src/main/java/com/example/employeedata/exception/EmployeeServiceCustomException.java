package com.example.employeedata.exception;

import lombok.Data;

@Data
public class EmployeeServiceCustomException extends RuntimeException {

    private String errorCode;

    public EmployeeServiceCustomException(String message){
        super(message);


    }
}
