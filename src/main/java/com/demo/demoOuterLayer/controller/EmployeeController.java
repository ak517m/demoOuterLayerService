package com.demo.demoOuterLayer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demoOuterLayer.model.Employee;
import com.demo.demoOuterLayer.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees/{empId}/address")
	public List<Employee> retrieveAddressForEmployee(@PathVariable String empId) {
		return employeeService.retrieveEmployeeInfo(empId);

	}

}
