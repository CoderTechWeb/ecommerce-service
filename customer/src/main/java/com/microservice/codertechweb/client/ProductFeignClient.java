package com.microservice.codertechweb.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.microservice.codertechweb.model.Product;

@FeignClient("product")
public interface ProductFeignClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "getProductsByCustomerId/{id}", consumes = "application/json")
	List<Product> getProductDetails(@PathVariable Long id);
}
