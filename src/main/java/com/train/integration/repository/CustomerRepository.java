package com.train.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.train.integration.model.Customer;
import java.util.List;
import java.util.Optional;
import java.util.Date;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepository extends JpaRepository<Customer, Long> {
   
}