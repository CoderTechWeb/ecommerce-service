package com.microservice.codertechweb.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Orders {
	
	private int id;
	
	private Long customerId;
		
	private String orderId;
	
	private String price;
	
	private String shippingAddress;
	
	private LocalDate deliveryDt;
	
	private LocalDate orderDt;
}
