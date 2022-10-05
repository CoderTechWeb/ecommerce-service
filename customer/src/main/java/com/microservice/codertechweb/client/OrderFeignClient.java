package com.microservice.codertechweb.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("order")
public interface OrderFeignClient {

}
