package com.github.gustavoflor.springdistributedtracing.customers.service;

import com.github.gustavoflor.springdistributedtracing.customers.payload.Customer;
import com.github.gustavoflor.springdistributedtracing.customers.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final AddressService addressService;

    public Optional<Customer> findById(final String id) {
        return customerRepository.findById(id)
                .map(entity -> new Customer(entity.getName(), addressService.findByCustomerId(id)));
    }
}
