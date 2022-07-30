package com.github.gustavoflor.springdistributedtracing.customers.service;

import com.github.gustavoflor.springdistributedtracing.customers.client.AddressClient;
import com.github.gustavoflor.springdistributedtracing.customers.payload.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressClient addressClient;

    public List<Address> findByCustomerId(final String customerId) {
        return addressClient.findByCustomerId(customerId);
    }
}
