package com.springboot.restapi.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.employee.entity.Employee;
import com.springboot.restapi.employee.service.IEmployeeservice;

@RestController
@RequestMapping("/app")
public class EmployeeRestController {
	
	private static final Employee Employee = null;
	@Autowired
	private IEmployeeservice iEmployeeservice;
	
	@GetMapping
    public List<Employee> getAllEmployees() {
        return iEmployeeservice.saveEmploye(Employee);
    }

}
