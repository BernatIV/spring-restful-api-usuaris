package com.usuaris.springrestfulapiusuaris.repository;

import com.usuaris.springrestfulapiusuaris.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
