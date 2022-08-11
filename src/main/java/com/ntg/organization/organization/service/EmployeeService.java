package com.ntg.organization.organization.service;


import com.ntg.organization.organization.entity.Employee;
import com.ntg.organization.organization.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public boolean save(Employee employee) {

        if (employee != null) {
            employeeRepository.save(employee);
            return true;
        }

        return false;
    }

    public boolean deleteById(long id) {
        if (id != 0) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
