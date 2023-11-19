package com.example.demo.empservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.empentity.EmployeeDetails;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

	public EmployeeDetails saveemployee(EmployeeDetails e) {
		// TODO Auto-generated method stub
		return repo.save(e);
	}
    
    public Optional<EmployeeDetails> getemployeedetals(Long id){
    	return repo.findById(id);
    }
    
    public Double getsalarybyid(Long id){
    	EmployeeDetails empdetails=repo.findById(id).get();
    	Double salary=empdetails.getSalary();
    	return salary;
    }
}
