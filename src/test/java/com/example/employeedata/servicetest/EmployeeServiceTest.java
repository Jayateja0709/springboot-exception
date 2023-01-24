package com.example.employeedata.servicetest;

import com.example.employeedata.entity.Employee;
import com.example.employeedata.repository.EmployeeRepository;
import com.example.employeedata.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;


@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    @InjectMocks
    EmployeeService employeeService;
    @Mock
    EmployeeRepository employeeRepository;

    @Test
    public void saveEmployeeTest() {

        String pattern = "1980-03-30";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Employee e1 = new Employee(22, "rakesh", 4000, 35, simpleDateFormat, "Sales");

        Mockito.when(employeeRepository.save(e1)).thenReturn(e1);
        employeeService.saveEmployee(e1);
       assertEquals(22,e1.getEmpId());

       assertNotNull(e1);

      //  Mockito.verify(e1,times(1)).saveEmployee(e1);



    }

}
