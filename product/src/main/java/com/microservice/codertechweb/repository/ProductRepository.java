package com.microservice.codertechweb.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.codertechweb.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByCustomerId(Long id);

}
