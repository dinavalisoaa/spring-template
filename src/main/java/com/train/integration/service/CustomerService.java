package com.train.integration.service;

import com.train.integration.dto.CustomerDTO;
import com.train.integration.model.Customer;
import com.train.integration.model.Gender;
import com.train.integration.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.train.integration.generic.GenericServiceImpl;

@Service
public class CustomerService extends GenericServiceImpl<Customer, Long> {
    public CustomerService(CustomerRepository repository) {
        super(repository);
    }
}