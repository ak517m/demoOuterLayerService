package com.demo.demoOuterLayer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.demo.demoOuterLayer.model.Employee;
@Component
public class EmployeeService {

	public static List<Employee> employees = new ArrayList<>();

	static {
		// Initialize Data

		Employee emp1 = new Employee("1", "NAME1", "ADDRESS1", "CTN1");
		Employee emp2 = new Employee("2", "NAME2", "ADDRESS2", "CTN2");
		Employee emp3 = new Employee("3", "NAME3", "ADDRESS3", "CTN3");
		Employee emp4 = new Employee("4", "NAME4", "ADDRESS4", "CTN4");
		Employee emp5 = new Employee("5", "NAME5", "ADDRESS5", "CTN5");
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}

	public List<Employee> retrieveEmployeeInfo(String id) {
		if (id == null) {
			return null;
		}
		Predicate<Employee> p = (e1) -> e1.getId().equalsIgnoreCase(id);
		return employees.stream().filter(p).collect(Collectors.toList());
	}

}
