package com.ntg.organization.organization.repository;

import com.ntg.organization.organization.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}