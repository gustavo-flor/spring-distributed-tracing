package com.github.gustavoflor.springdistributedtracing.customers.client;

import com.github.gustavoflor.springdistributedtracing.customers.payload.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "address-client", url = "http://localhost:8090")
public interface AddressClient {
    String CUSTOMER_ID_HEADER_NAME = "X-Customer-Id";

    @GetMapping("/addresses")
    List<Address> findByCustomerId(@RequestHeader(CUSTOMER_ID_HEADER_NAME) final String customerId);
}
