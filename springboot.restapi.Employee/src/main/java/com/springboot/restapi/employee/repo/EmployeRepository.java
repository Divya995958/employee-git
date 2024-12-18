package com.springboot.restapi.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restapi.employee.entity.Employee;

public interface EmployeRepository extends JpaRepository<Employee,Integer> {
	

}
