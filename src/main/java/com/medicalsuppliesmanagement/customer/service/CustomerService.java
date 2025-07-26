package com.medicalsuppliesmanagement.customer.service;

import com.medicalsuppliesmanagement.customer.entity.Customer;

public interface CustomerService {
    Customer save(Customer customer);
    Customer findById(Long id);
} 