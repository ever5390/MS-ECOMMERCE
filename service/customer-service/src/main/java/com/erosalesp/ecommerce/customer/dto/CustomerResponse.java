package com.erosalesp.ecommerce.customer.dto;

import com.erosalesp.ecommerce.customer.entities.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {
}
