package com.example.demo.empentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeedetails")
public class EmployeeDetails {
	@Id
	@Column(name = "empid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "empname")
	private String name;
	@Column(name = "salary")
	private Double Salary;

	public int getId() {
		return id;
	}

	public EmployeeDetails() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}

	public EmployeeDetails(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
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

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}
}
