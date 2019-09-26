package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee , Integer> {

}