package com.howtodoinjava.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private String name;
	private int salary;
//	@Autowired
//	@Qualifier("address1")
	private Address address;
	private List<String> skills;
	private Map<String, String> exp;
	private Properties db;

	public Employee(String name, int salary, Address address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;

	}

	public Map<String, String> getExp() {
		return exp;
	}

	public void setExp(Map<String, String> exp) {
		this.exp = exp;
	}

	
	public Properties getDb() {
		return db;
	}

	public void setDb(Properties db) {
		this.db = db;
	}

	public Employee(String name, int salary, Address address, List<String> skills, Map<String, String> exp,
			Properties db) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.skills = skills;
		this.exp = exp;
		this.db = db;
	}

	public Employee(String name, int salary, Address address, List<String> skills, Map<String, String> exp) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.skills = skills;
		this.exp = exp;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Employee(String name, int salary, Address address, List<String> skills) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.skills = skills;
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
		return "Employee [name=" + name + ", salary=" + salary + ", address=" + address + ", skills=" + skills
				+ ", exp=" + exp + ", db=" + db + "]";
	}

}
