package com.codeclan.employeproject.repositories;

import com.codeclan.employeproject.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
