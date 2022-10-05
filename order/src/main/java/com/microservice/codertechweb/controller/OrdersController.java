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

import com.microservice.codertechweb.model.Orders;
import com.microservice.codertechweb.repository.OrdersRepository;

@RestController
public class OrdersController {

	@Autowired 
	OrdersRepository ordersRepository;
	
	@GetMapping("/getOrder/{id}")
	public Orders getOrderDetail(@PathVariable Long id) {
		Optional<Orders> findById = ordersRepository.findById(id);
		return findById.get();
	}
	
	@GetMapping("/getOrders")
	public List<Orders> getAllOrderDetail() {
		return (List<Orders>) ordersRepository.findAll();
	}
	
	@PostMapping("/addOrder")
	public void addOrder(@RequestBody Orders order) {
		LocalDate now = LocalDate.now();
		order.setOrderDt(now);
		order.setDeliveryDt(now.plusDays(5));
		ordersRepository.save(order);
	}
	
	@DeleteMapping("/deleteOrder/{id}")
	public void deleteOrder(@PathVariable Long id) {
		ordersRepository.deleteById(id);
	}
	
	@GetMapping("/getOrdersByCustomerId/{id}")
	public List<Orders> getOrdersByCustomerId(@PathVariable Long id) {
		List<Orders> orders = ordersRepository.findByCustomerId(id);
		if(orders !=null) {
			return orders;
		} else {
			return null;
		}
	}
}
