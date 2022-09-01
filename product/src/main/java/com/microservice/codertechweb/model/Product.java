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
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "product_description")
	private String productDescription;
	
	@Column(name = "delivery_dt")
	private LocalDate deliveryDt;
}
