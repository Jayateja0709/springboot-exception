package com.example.employeedata.controller;

import com.example.employeedata.entity.Employee;
import com.example.employeedata.entity.ErrorResponse1;
import com.example.employeedata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping(value = "/addEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){

        Employee e1 = employeeService.saveEmployee(employee);
        return ResponseEntity.ok(e1);
    }

@GetMapping(value = "/getEmployee/{id}")
   public ResponseEntity<Employee> getEmployee(@PathVariable  int id){
        return employeeService.getEmployee(id);
    }
}
