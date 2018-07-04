package com.usuaris.springrestfulapiusuaris.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers") // Posar la URI aquí fa que no l'haguem de repetir cada vegada.
public class CustomerController {

    // Posant @Autowired també funciona si li trec el constructor

//    @Autowired
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("") // localhost:8080/customers
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
