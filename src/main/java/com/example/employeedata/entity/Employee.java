package com.example.employeedata.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int empId;
    @Column(name = "EmpName")
    String empName;
    @Column(name = "EmpSal")
    double empSalary;
    @Column(name = "EmpAge")
    int age;
    @Column(name = "EmpDOJ")
    String doj;
    @Column(name = "EmpDept")
    String deptName;

}
