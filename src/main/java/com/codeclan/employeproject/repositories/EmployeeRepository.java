package com.codeclan.employeproject.repositories;

import com.codeclan.employeproject.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
