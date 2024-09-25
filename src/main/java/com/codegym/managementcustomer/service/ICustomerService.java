package com.codegym.managementcustomer.service;

import com.codegym.managementcustomer.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findOne(Long id);

    void save(Customer customer);

    void deleteById(Long id);
}
