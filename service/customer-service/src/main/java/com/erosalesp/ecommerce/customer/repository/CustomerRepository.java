package com.erosalesp.ecommerce.customer.repository;

import com.erosalesp.ecommerce.customer.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String > {

}

