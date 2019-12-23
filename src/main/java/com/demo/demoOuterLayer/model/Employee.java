package com.demo.demoOuterLayer.model;

public class Employee {

	private String id;
	private String name;
	private String address;
	private String ctn;

	public Employee(String id, String name, String address, String ctn) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.ctn = ctn;
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

	public String getCtn() {
		return ctn;
	}

	public void setCtn(String ctn) {
		this.ctn = ctn;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", ctn=" + ctn + "]";
	}
	
	

}
