package com.ntg.organization.organization.controller;

import com.ntg.organization.organization.dto.DepartmentDTO;
import com.ntg.organization.organization.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(value = "/")
    public List<DepartmentDTO> getAllDepartment() {
        return departmentService.getAll();
    }
}
