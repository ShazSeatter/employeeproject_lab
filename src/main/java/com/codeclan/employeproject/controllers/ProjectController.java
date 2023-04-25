package com.codeclan.employeproject.controllers;

import com.codeclan.employeproject.models.Project;
import com.codeclan.employeproject.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/projects")
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
