package com.train.integration.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.train.integration.dto.ArticleDTO;
import com.train.integration.service.*;
import com.train.integration.model.Category;
import org.springframework.http.HttpStatus;
import com.train.integration.generic.GenericController;
import com.train.integration.generic.GenericService;

@RestController
@RequestMapping(path = "/category-product")
public class CategoryController extends GenericController<Category, Long> {

    public CategoryController( CategoryService service) {
        super(service);

    }
}