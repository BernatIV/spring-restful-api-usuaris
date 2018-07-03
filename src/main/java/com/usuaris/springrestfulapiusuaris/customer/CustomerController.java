package com.usuaris.springrestfulapiusuaris.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    // Al tanto! En l'exemlpe spring-boot-auth (connexió segura) no fa servir @Autowired sinó un constructor per omplir CustomerRepository.

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("")
    public List<Customer> retrieveAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer retrieveCustomer(@PathVariable long id) { // long oder Long?
        Optional<Customer> customer = customerRepository.findById(id);

        if (!customer.isPresent()) {
            throw new RuntimeException(); // throw new CustomerNotFoundException("id-" + id);
        }

        return customer.get();
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable long id) {
        customerRepository.deleteById(id);
    }

    @PostMapping("")
    public ResponseEntity<Object> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedCustomer.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer, @PathVariable long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);

        if (!customerOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        customer.setId(id);
        customerRepository.save(customer);

        return ResponseEntity.noContent().build();
    }
}
