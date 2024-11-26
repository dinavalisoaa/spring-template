package com.train.integration.service;

import com.train.integration.dto.ProductDTO;
import com.train.integration.model.Product;
import com.train.integration.model.Gender;
import com.train.integration.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.train.integration.generic.GenericServiceImpl;

@Service
public class ProductService extends GenericServiceImpl<Product, Long> {

    public ProductService(ProductRepository repository) {
        super(repository);
    }
}