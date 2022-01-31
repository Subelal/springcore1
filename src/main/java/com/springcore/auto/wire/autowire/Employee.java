package com.springcore.auto.wire.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address22")
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting values ");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}
