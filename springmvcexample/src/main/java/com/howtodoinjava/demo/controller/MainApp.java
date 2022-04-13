package com.howtodoinjava.demo.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.howtodoinjava.demo.model.EmployeeVO;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//
//		Resource res = new ClassPathResource("application.xml");
//        BeanFactory factory = new XmlBeanFactory(res);	
//        EmployeeVO emp = context.getBean("emp", EmployeeVO.class);
//         context.registerShutdownHook();
//
//		
//		System.out.println(emp);
////        System.out.println(context.getBean("emp"));

		System.out.println(context.getBean("emp"));
	}

}
