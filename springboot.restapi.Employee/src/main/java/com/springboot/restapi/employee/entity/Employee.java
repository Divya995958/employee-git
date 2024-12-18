package com.springboot.restapi.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee-detailes")
public class Employee {
	@Id
	@Column(name="e-id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	

	@Column(name="e-name" ,length=52)
	private String name;
	
	@Column(name="e-role")
	private String role;
	
	@Column(name="e-salary")
	private Double salary;
	
	@Column(name="e-location")
   private String location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
