package com.microservice.codertechweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.codertechweb.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	Customer findById(int id);

}
