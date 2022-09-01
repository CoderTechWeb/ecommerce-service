package com.microservice.codertechweb.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "shipping_address")
	private String shippingAddress;
	
	@Column(name = "delivery_dt")
	private LocalDate deliveryDt;
	
	@Column(name = "order_dt")
	private LocalDate orderDt;
}
