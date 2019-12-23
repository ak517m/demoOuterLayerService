package com.ab.demoOuterLayer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ab.demoOuterLayer.model.Customer;
@Component
public class CustomerInfoService {

	static List<Customer> customers = new ArrayList<>();
	
	static {

		Customer customer1 = new Customer("11", "Abhishek Kumar", "Whiteplains", "11/21/1988");
		Customer customer2 = new Customer("21", "Abhishek Kumar21", "Whiteplains21", "11/21/198821");
		Customer customer3 = new Customer("31", "Abhishek Kumar31", "Whiteplains31", "11/21/198831");
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
	}

	public List<Customer> retrieveCustomerInfo(String id) {
		List<Customer> returnedCustomerList = new ArrayList<>();
		for (Customer customer : customers) {
			if (customer == null) {
				return null;
			}
			if (customer.getId().equals(id)) {
				returnedCustomerList.add(customer);
			}

		}
		return returnedCustomerList;
	}

}
