package com.howtodoinjava.demo.model;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeVO implements Serializable, InitializingBean, DisposableBean {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String firstName;
	private String lastName;

	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		System.out.println(id);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void init() {
		System.out.println("init method called");

	}

	public void destroy() {
		System.out.println("destroy method called");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("initializingbean called");
	}

	@PostConstruct
	public void start() {
		System.out.println("start by annotaion called");
	}

	@PreDestroy
	public void end() {
		System.out.println("end  by annotaion called");
	}

}