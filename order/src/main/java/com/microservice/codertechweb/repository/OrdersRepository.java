package com.microservice.codertechweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.codertechweb.model.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Long> {

}
