package com.ojas.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.entity.Employee;
import com.ojas.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {
	 @Autowired
	private EmployeeRepo repo;

	public Employee saveEmployee(Employee emp) {
		
		return repo.save(emp);
	}

}
