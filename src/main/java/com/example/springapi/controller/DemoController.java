package com.example.springapi.controller;

import com.example.springapi.entity.Customer;
import com.example.springapi.record.CustomerRecord;
import com.example.springapi.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {
    CustomerRepository customerRepository;

    DemoController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/getCustomerById/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        return ResponseEntity.ok(customerRepository.findById(id).orElse(null));
    }

    @GetMapping("/getCustomerByName/{name}")
    public ResponseEntity<CustomerRecord> getCustomerByName(@PathVariable String name) {
        return ResponseEntity.ok(customerRepository.findCustomerByFirstName(name).orElse(null));
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customerRecord) {
        return ResponseEntity.ok(customerRepository.save(customerRecord));
    }
}
