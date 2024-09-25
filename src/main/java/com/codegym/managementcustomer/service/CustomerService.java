package com.codegym.managementcustomer.service;

import com.codegym.managementcustomer.model.Customer;
import com.codegym.managementcustomer.repo.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
@Autowired
    private ICustomerRepository CustomerRepository;

    @Override
    public List<Customer> findAll() {
        return CustomerRepository.findAll();
    }

    @Override
    public Customer findOne(Long id) {
        return CustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        CustomerRepository.save(customer);

    }

    @Override
    public void deleteById(Long id) {
        CustomerRepository.deleteById(id);

    }
}
