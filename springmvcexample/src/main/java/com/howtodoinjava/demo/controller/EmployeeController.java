package com.howtodoinjava.demo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.howtodoinjava.demo.dao.EmployeeDAO;
import com.howtodoinjava.demo.dao.photos;

@Controller
@RequestMapping("/employee-module")
@Configuration
public class EmployeeController {
	@Autowired
	EmployeeDAO manager;

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping(value = "/nasa", method = RequestMethod.GET)
	public @ResponseBody String getNasa() {
		System.out.println("nasa1");
//		String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY";
//		photos[] response = restTemplate.getForObject(url, photos[].class);
//	
//		System.out.println("asdfsafd");System.out.println(response.length);
//		System.out.println(response[0]);

		String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=3g1CZeBLLfJ98IsQdns9WmZ9JIyMFiVtxjj5HHSL";
		String result = restTemplate.getForObject(url, String.class);
		System.out.println("sdfsd");
		return result;
	}

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		System.out.println("test");
//		String url = "http://example.org/path/to/api";
//		User response = restTemplate.getForObject(url, User.class);

		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
	}
}