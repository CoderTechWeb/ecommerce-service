package com.microservice.codertechweb.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class CustomerDetails {
	
	private Customer customer;
	private List<Orders> orders;
	private List<Product> products;
}
