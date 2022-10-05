package com.microservice.codertechweb.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("product")
public interface ProductFeignClient {

}
