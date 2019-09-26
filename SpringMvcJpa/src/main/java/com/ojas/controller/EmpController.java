package com.ojas.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ojas.entity.Employee;
import com.ojas.service.EmployeeService;

@Controller
public class EmpController {
 @Autowired
 private EmployeeService service;
  
 @RequestMapping("/home")
 public String homePage() {
	 return "home";
 }
  
  @RequestMapping(value = "/save",method = RequestMethod.POST)
 	public String save(@ModelAttribute("employee")Employee e) {
	    service.saveEmployee(e);
		return "home";
 		
 	}
 
}
