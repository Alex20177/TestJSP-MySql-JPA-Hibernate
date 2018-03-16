package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Customer;
import com.example.thymeleaf.CustomerRepository;

@Controller
public class HelloController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		
		List<Customer> customers=(List<Customer>) customerRepository.findAll();
		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
		model.addAttribute("customers", customers);
		return "hello";
		
	}//Close hello method.

}//Close HelloController class.
