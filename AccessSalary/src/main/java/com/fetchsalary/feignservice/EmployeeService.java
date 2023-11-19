package com.fetchsalary.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="employee-service",url="http://localhost:8085")
public interface EmployeeService {

	@GetMapping("/empdetails/salary/{id}")
	Double getEmployeeSalary(@PathVariable("id") Long id);
}
