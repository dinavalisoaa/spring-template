package com.train.integration.service;

import com.train.integration.model.Category;
import com.train.integration.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.train.integration.generic.GenericServiceImpl;

@Service
public class CategoryService extends GenericServiceImpl<Category, Long> {
    public CategoryService(CategoryRepository repository) {
        super(repository);
    }
}