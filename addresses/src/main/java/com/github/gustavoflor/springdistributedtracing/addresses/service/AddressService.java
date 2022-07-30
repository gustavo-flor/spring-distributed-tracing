package com.github.gustavoflor.springdistributedtracing.addresses.service;

import com.github.gustavoflor.springdistributedtracing.addresses.payload.Address;
import com.github.gustavoflor.springdistributedtracing.addresses.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;

    public List<Address> findAllByCustomerId(final String customerId) {
        return addressRepository.findAllByCustomerId(customerId)
                .stream()
                .map(entity -> new Address(entity.getZipCode()))
                .toList();
    }
}
