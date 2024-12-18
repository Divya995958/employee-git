package com.springboot.restapi.employee.service;

import java.util.List;

import com.springboot.restapi.employee.entity.Employee;

public interface IEmployeeservice {
	
	public List<Employee> saveEmploye(Employee e);

}
