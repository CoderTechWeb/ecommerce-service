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
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "product_id")
	private String productId;
	
	@Column(name="customer_id")
	private Long customerId;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "product_description")
	private String productDescription;
	
	@Column(name = "delivery_dt")
	private LocalDate deliveryDt;
}
