package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    // METHOD SAVE EMPLOYEE
    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
    	Employee employeeY =employeeRepository.save(employee);
        return ResponseEntity.ok(employeeY);
    }

    // METHOD SAVE LIST EMPLOYEE
    @PostMapping("/saveEmployees")
    public ResponseEntity<List<Employee>> saveAllEmployees(@RequestBody List<Employee> employees) {
        employeeRepository.saveAll(employees);
        return ResponseEntity.ok(employees);  
    }
}
