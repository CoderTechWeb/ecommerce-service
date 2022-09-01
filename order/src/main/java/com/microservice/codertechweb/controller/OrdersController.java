package com.microservice.codertechweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.codertechweb.model.Orders;
import com.microservice.codertechweb.repository.OrdersRepository;

@Controller
public class OrdersController {

	@Autowired 
	OrdersRepository ordersRepository;
	
	@GetMapping("/getCustomer/{id}")
	public Orders getCustomerDetail(@PathVariable Long id) {
		Optional<Orders> findById = ordersRepository.findById(id);
		return findById.get();
	}
	
	@GetMapping("/getCustomers")
	public List<Orders> getAllCustomerDetail() {
		return (List<Orders>) ordersRepository.findAll();
	}
	
	@PostMapping("/addCustomer")
	public void addCustomer(@RequestBody Orders order) {
		ordersRepository.save(order);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		ordersRepository.deleteById(id);
	}
}
