package com.ntg.organization.organization.controller;

import com.ntg.organization.organization.entity.Employee;
import com.ntg.organization.organization.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp/v1")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/all")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PostMapping(value = "/add")
    public boolean createNewEmployee(@RequestBody Employee newEmp) {
        return employeeService.createNewEmployee(newEmp);
    }

    @DeleteMapping(value = "/del/{empId}")
    public boolean deleteEmployee(@PathVariable(value = "empId") Long id) {
        return employeeService.deleteEmployeeById(id);
    }
}
