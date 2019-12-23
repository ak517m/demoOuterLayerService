package com.ab.demoOuterLayer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ab.demoOuterLayer.model.Customer;
import com.ab.demoOuterLayer.service.CustomerInfoService;

@RestController
public class OuterLayerController {
	@Autowired
	public CustomerInfoService customerInfoService;

	@GetMapping("/Customers/{id}")
	public List<Customer> retrieveCustomerInformation(@PathVariable String id) {
		return customerInfoService.retrieveCustomerInfo(id);

	}

}
