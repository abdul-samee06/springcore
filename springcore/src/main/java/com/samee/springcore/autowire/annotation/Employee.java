package com.samee.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int empId;
	private String name;

	
	@Autowired
	@Qualifier("address2")
	private Address address1;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address1;
	}

	
	/* @Autowired */
	 public void setAddress(Address address) {
		System.out.println("Setting Address");
		this.address1 = address;
	}

	/* @Autowired */
	public Employee(Address address) {
		super();
		this.address1 = address;
		System.out.println("Inside Constructor");
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address1 + "]";
	}

}
