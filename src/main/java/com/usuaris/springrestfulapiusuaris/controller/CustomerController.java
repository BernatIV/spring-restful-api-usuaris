package com.usuaris.springrestfulapiusuaris.controller;

import com.usuaris.springrestfulapiusuaris.entity.Customer;
import com.usuaris.springrestfulapiusuaris.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> retrieveAllCustomers() {
        return customerRepository.findAll();
    }
}
