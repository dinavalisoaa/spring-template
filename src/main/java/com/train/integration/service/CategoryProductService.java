package com.train.integration.service;

import com.train.integration.dto.CategoryProductDTO;
import com.train.integration.model.CategoryProduct;
import com.train.integration.repository.CategoryProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.train.integration.generic.GenericServiceImpl;

@Service
public class CategoryProductService extends GenericServiceImpl<CategoryProduct, Long> {
    public CategoryProductService(CategoryProductRepository repository) {
        super(repository);
    }
}