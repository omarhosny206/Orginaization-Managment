package com.ntg.organization.organization.dto;


import com.ntg.organization.organization.entity.Employee;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentDTO {
    private Long id;
    private String deptName;
    private List<Employee> employees;
}

