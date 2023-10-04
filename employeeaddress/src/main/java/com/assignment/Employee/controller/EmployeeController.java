package com.assignment.Employee.controller;

import com.assignment.Employee.service.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    Employee employee;

    @PostMapping("employee")
    public String addEmployee(@RequestBody com.assignment.Employee.model.Employee employee){
        return this.employee.addEmployee(employee);
    }

    @GetMapping("employee/{employeeId}")
    public com.assignment.Employee.model.Employee getEmployeeById(@PathVariable Long employeeId){
        return employee.getEmployeeById(employeeId);
    }

    @GetMapping("employee")
    public List<com.assignment.Employee.model.Employee> getAllEmployee(){
        return employee.getAllEmployee();
    }

    @PutMapping("employee/{employeeId}")
    public String updateEmployee(@PathVariable Long employeeId,@RequestBody com.assignment.Employee.model.Employee employee){
        return this.employee.updateEmployee(employeeId,employee);
    }

    @DeleteMapping("employee/{employeeId}")
    public String deleteEmployee(@PathVariable Long employeeId){
        return employee.deleteEmployee(employeeId);
    }
}
