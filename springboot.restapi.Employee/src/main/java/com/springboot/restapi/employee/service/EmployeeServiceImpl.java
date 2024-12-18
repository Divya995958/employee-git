package com.springboot.restapi.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.employee.entity.Employee;
import com.springboot.restapi.employee.repo.EmployeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements IEmployeeservice {

	@Autowired
	private EmployeRepository employeerepository;
	
	

	@Override
	public List<Employee> saveEmploye(Employee e) {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}
		

		
	
	}


