package com.fetchsalary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fetchsalary.feignservice.EmployeeService;
import com.fetchsalary.pojo.Tax;
import com.fetchsalary.service.TaxService;

@RestController
public class TaxController {

	@Autowired
	private TaxService taxserve;
	
	@PostMapping("save")
	public String savedetails(@RequestBody Tax t) {
		 taxserve.savetax(t);
		 return "Added Successfully";
	}
	
	@Autowired
	private EmployeeService empserve;
	
	@GetMapping("/salary/{id}")
	public Double getSalary(@PathVariable("id") long id) {
		return empserve.getEmployeeSalary(id);
	}
}
