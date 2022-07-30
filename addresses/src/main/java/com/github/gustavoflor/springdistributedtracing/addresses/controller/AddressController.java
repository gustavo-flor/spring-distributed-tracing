package com.github.gustavoflor.springdistributedtracing.addresses.controller;

import com.github.gustavoflor.springdistributedtracing.addresses.payload.Address;
import com.github.gustavoflor.springdistributedtracing.addresses.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/addresses")
@RequiredArgsConstructor
public class AddressController {
    private static final String CUSTOMER_ID_HEADER_NAME = "X-Customer-Id";

    private final AddressService addressService;

    @GetMapping
    public List<Address> findAllByCustomerId(@RequestHeader(CUSTOMER_ID_HEADER_NAME) final String customerId) {
        log.info("Searching addresses by customer ID [{}]", customerId);
        return addressService.findAllByCustomerId(customerId);
    }
}
