package com.microservice.codertechweb.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.codertechweb.model.Product;
import com.microservice.codertechweb.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired 
	ProductRepository productRepository;
	
	@GetMapping("/getProduct/{id}")
	public Product getCustomerDetail(@PathVariable Long id) {
		Optional<Product> findById = productRepository.findById(id);
		return findById.get();
	}
	
	@GetMapping("/getProducts")
	public List<Product> getAllCustomerDetail() {
		return (List<Product>) productRepository.findAll();
	}
	
	@PostMapping("/addProduct")
	public void addCustomer(@RequestBody Product product) {
		LocalDate now = LocalDate.now();
		product.setDeliveryDt(now.plusDays(5));
		productRepository.save(product);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		productRepository.deleteById(id);
	}
}
