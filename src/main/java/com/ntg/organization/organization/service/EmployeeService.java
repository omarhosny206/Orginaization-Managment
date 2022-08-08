package com.ntg.organization.organization.service;

import com.ntg.organization.organization.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    static List<Employee> employees = null;

    static {
        employees = new ArrayList<>();
        employees.add(new Employee(1L, "Ahmed", "Ahmed@mail.com"));
        employees.add(new Employee(2L, "Mohamed", "mohamed@mail.com"));
    }

    public List<Employee> getAllEmployee() {
        return employees;
    }

    public boolean createNewEmployee(Employee newEmp) {

        if (newEmp != null) {
            employees.add(newEmp);
            return true;
        }

        return false;
    }

    public boolean deleteEmployeeById(Long id) {

        if (id != null) {

            for (Employee employee : employees) {

                if (employee.getId().equals(id)) {
                    employees.remove(employee);

                    return true;
                }
            }
        }

        return false;
    }

}
