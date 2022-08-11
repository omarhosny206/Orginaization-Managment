package com.ntg.organization.organization.controller;



import com.ntg.organization.organization.entity.Employee;
import com.ntg.organization.organization.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }


    @PostMapping(value = "/")
    public boolean save(@RequestBody Employee emp) {
        return employeeService.save(emp);
    }

    @DeleteMapping("/id")
    public boolean deleteById(@PathVariable long id) {
        return employeeService.deleteById(id);
    }
}
