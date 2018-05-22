package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.Customer;
import com.example.entities.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class MyRestController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Iterable<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
}//Close MyRestController class.
