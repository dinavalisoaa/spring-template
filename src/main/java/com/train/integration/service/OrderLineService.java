package com.train.integration.service;

import com.train.integration.model.OrderLine;
import com.train.integration.repository.OrderLineRepository;
import org.springframework.stereotype.Service;
import com.train.integration.generic.GenericServiceImpl;

@Service
public class OrderLineService extends GenericServiceImpl<OrderLine, Long> {

    public OrderLineService(OrderLineRepository repository) {
        super(repository);
    }
}