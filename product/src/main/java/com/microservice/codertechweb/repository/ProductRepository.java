package com.microservice.codertechweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.codertechweb.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
