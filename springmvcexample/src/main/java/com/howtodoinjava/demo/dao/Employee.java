package com.howtodoinjava.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private String name;
	private int salary;
//	@Autowired
//	@Qualifier("address1")
	private Address address;

	public Employee(String name, int salary, Address address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Employee(Address address) {
		super();
		System.out.println("By constructor");
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		System.out.println("setting address");
		this.address = address;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
