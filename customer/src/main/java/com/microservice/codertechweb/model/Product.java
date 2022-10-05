package com.microservice.codertechweb.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Product {
	
	private int id;
	
	private String productId;
	
	private Long customerId;
	
	private String price;
	
	private String productDescription;
	
	private LocalDate deliveryDt;
}
