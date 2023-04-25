package com.codeclan.employeproject.repositories;

import com.codeclan.employeproject.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Long>{
}
