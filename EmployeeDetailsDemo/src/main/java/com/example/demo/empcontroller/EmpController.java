package com.example.demo.empcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.empentity.EmployeeDetails;
import com.example.demo.empservice.EmployeeService;

@RestController
@RequestMapping("empdetails")
public class EmpController {
	
  @Autowired
  private EmployeeService service;
  @PostMapping("/save")
  public EmployeeDetails save(@RequestBody EmployeeDetails e) {
	  return service.saveemployee(e);
  }
  
  @GetMapping("/fetch/{id}")
  public Optional<EmployeeDetails> get(@PathVariable("id") Long id){
	  return service.getemployeedetals(id);
  }
  @GetMapping("/salary/{id}")
  public Double getsalarybyid(@PathVariable("id")  Long id) {  
	  return service.getsalarybyid(id);
  }
}  
