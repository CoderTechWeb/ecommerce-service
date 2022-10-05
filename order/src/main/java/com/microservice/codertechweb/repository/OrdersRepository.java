package com.microservice.codertechweb.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.microservice.codertechweb.model.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Long> {

	List<Orders> findByCustomerId(Long id);

}
