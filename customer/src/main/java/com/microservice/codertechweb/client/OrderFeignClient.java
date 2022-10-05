package com.microservice.codertechweb.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.microservice.codertechweb.model.Orders;

@FeignClient("order")
public interface OrderFeignClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "getOrdersByCustomerId/{id}", consumes = "application/json")
	List<Orders> getOrderDetails(@PathVariable Long id);
}
