package com.example.employeedata.service;

import com.example.employeedata.entity.Employee;
import com.example.employeedata.entity.ErrorResponse1;
import com.example.employeedata.exception.EmployeeServiceCustomException;
import com.example.employeedata.repository.EmployeeRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.beans.BeanUtils.copyProperties;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);

    }

    public ResponseEntity<Employee> getEmployee(int id) {


        Optional<Employee> e= employeeRepository.findById(id);
        if (e.isPresent()) {
            return new ResponseEntity<>(e.get(), HttpStatus.OK);
        } else {
            throw new EmployeeServiceCustomException("Employee Not found");
        }
    }
}
