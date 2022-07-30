package com.github.gustavoflor.springdistributedtracing.addresses.repository;

import com.github.gustavoflor.springdistributedtracing.addresses.entity.AddressEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends MongoRepository<AddressEntity, String> {
    List<AddressEntity> findAllByCustomerId(String customerId);
}
