package com.fetchsalary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fetchsalary.pojo.Tax;
import com.fetchsalary.repository.SalaryRepository;

@Service
public class TaxService {

	 @Autowired
	 private  SalaryRepository salrepo;
	 
	 public Tax savetax(Tax t) {
		 return salrepo.save(t);
	 }
}
