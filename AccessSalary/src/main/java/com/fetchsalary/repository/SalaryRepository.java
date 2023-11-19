package com.fetchsalary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fetchsalary.pojo.Tax;

public interface SalaryRepository extends JpaRepository<Tax,Long>{

}
