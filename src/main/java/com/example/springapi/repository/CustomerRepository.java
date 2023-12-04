package com.example.springapi.repository;

import com.example.springapi.entity.Customer;
import com.example.springapi.record.CustomerRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<CustomerRecord> findCustomerByFirstName(String firstName);
}
