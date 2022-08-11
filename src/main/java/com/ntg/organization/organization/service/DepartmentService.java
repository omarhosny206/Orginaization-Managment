package com.ntg.organization.organization.service;

import com.ntg.organization.organization.dto.DepartmentDTO;
import com.ntg.organization.organization.entity.Department;
import com.ntg.organization.organization.repository.DepartmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<DepartmentDTO> getAll() {
        List<Department> departments =  departmentRepository.findAll();
        List<DepartmentDTO> departmentDTOS = null;

        if(!departments.isEmpty()) {
            departmentDTOS = new ArrayList<>();
            DepartmentDTO departmentDTO = null;
            for (Department department : departments) {
                departmentDTO = new DepartmentDTO();
                BeanUtils.copyProperties(department, departmentDTO);
                departmentDTOS.add(departmentDTO);
            }
        }

        return departmentDTOS;
    }
}
