package com.github.gustavoflor.springdistributedtracing.customers.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@Getter
@Setter
public class CustomerEntity {
    @Id
    private String id;

    private String name;
}
