package com.github.gustavoflor.springdistributedtracing.addresses.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "addresses")
@Getter
@Setter
public class AddressEntity {
    @Id
    private String id;

    private String zipCode;

    @Indexed
    private String customerId;
}
