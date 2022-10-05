package com.microservice.codertechweb.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.codertechweb.client.OrderFeignClient;
import com.microservice.codertechweb.client.ProductFeignClient;
import com.microservice.codertechweb.model.Customer;
import com.microservice.codertechweb.model.CustomerDetails;
import com.microservice.codertechweb.model.Orders;
import com.microservice.codertechweb.model.Product;
import com.microservice.codertechweb.repository.CustomerRepository;
import com.netflix.discovery.converters.Auto;

@RestController
public class CustomerController {

	@Autowired 
	CustomerRepository customerRepository;
	
	@Autowired
	OrderFeignClient orderFeignClient;
	
	@Autowired
	ProductFeignClient productFeignClient;
	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomerDetail(@PathVariable Long id) {
		Optional<Customer> findById = customerRepository.findById(id);
		return findById.get();
	}
	
	@GetMapping("/getCustomers")
	public List<Customer> getAllCustomerDetail() {
		return (List<Customer>) customerRepository.findAll();
	}
	
	@PostMapping("/addCustomer")
	public void addCustomer(@RequestBody Customer cust) {
		cust.setCreateDt(LocalDate.now());
		customerRepository.save(cust);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		customerRepository.deleteById(id);
	}
	
	@GetMapping("/myCustomerDetails/{id}")
	public CustomerDetails myCustomerDetails(@PathVariable Long id) {
		Customer customer = customerRepository.findById(id).get();
		List<Orders> orders = orderFeignClient.getOrderDetails(id);
		List<Product> product = productFeignClient.getProductDetails(id);

		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setCustomer(customer);
		customerDetails.setOrders(orders);
		customerDetails.setProducts(product);
		
		return customerDetails;

	}
} 