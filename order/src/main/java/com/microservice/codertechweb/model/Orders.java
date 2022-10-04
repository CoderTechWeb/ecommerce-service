package com.microservice.codertechweb.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "order_id")
	private String orderId;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "shipping_address")
	private String shippingAddress;
	
	@Column(name = "delivery_dt")
	private LocalDate deliveryDt;
	
	@Column(name = "order_dt")
	private LocalDate orderDt;
}
