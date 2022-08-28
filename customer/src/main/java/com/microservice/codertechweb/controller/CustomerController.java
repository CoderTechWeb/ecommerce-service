package com.microservice.codertechweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.codertechweb.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired 
	CustomerRepository customerRepository;
	
	@GetMapping("/getCustomer/{id}")
	public void getCustomerDetail(@PathVariable Long id) {
		customerRepository.findById(id);
	}
	
}
