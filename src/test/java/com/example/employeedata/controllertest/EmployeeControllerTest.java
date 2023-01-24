package com.example.employeedata.controllertest;

import com.example.employeedata.controller.EmployeeController;
import com.example.employeedata.entity.Employee;
import com.example.employeedata.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

    @InjectMocks
    EmployeeController employeeController;
    @Mock
    EmployeeService employeeService;
    @Test
    public void addEmployeeTest() {
        String pattern = "1980-03-30";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Employee e1 = new Employee(22, "rakesh", 4000, 35, pattern, "Sales");
        Mockito.when(employeeService.saveEmployee(e1)).thenReturn(e1);
		employeeController.saveEmployee(e1);
         assertEquals(4000, e1.getEmpSalary());
    }
}
