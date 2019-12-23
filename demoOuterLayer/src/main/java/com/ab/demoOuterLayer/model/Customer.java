package com.ab.demoOuterLayer.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	public String id;
	public String name;
	public String address;
	public String dob;
	public Customer() {}
	public Customer(String id, String name, String address, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + "]";
	}

}
