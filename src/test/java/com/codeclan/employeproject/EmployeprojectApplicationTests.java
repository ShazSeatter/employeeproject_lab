package com.codeclan.employeproject;

import com.codeclan.employeproject.models.Department;
import com.codeclan.employeproject.models.Employee;
import com.codeclan.employeproject.models.Project;
import com.codeclan.employeproject.repositories.DepartmentRepository;
import com.codeclan.employeproject.repositories.EmployeeRepository;
import com.codeclan.employeproject.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeprojectApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;


	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createDepartmentAndEmployee(){
		Department department = new Department("Information Technology");
		departmentRepository.save(department);

		Employee employee = new Employee("Bart", "Simpson","3458287EF", department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeeAndProject(){
		Department department = new Department("Information Technology");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Bart", "Simpson","3458287EF", department);
		employeeRepository.save(employee1);

		Project project1 = new Project("Understand Annotations", 7);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}
}
