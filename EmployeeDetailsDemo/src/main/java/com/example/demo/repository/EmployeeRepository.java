package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.empentity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Long> {

}
