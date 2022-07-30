package com.github.gustavoflor.springdistributedtracing.customers.payload;

import java.util.List;

public record Customer(String name, List<Address> addresses) {
}
