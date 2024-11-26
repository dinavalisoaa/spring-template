package com.train.integration.service;

import com.train.integration.model.Order;
import com.train.integration.repository.OrderRepository;
import org.springframework.stereotype.Service;
import com.train.integration.generic.GenericServiceImpl;

@Service
public class OrderService extends GenericServiceImpl<Order, Long> {

    public OrderService(OrderRepository repository) {
        super(repository);
    }
}