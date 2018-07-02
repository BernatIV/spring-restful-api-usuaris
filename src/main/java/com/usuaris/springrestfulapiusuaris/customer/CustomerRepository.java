package com.usuaris.springrestfulapiusuaris.customer;

import com.usuaris.springrestfulapiusuaris.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
