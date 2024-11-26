package com.train.integration.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.train.integration.dto.ArticleDTO;
import com.train.integration.service.*;
import com.train.integration.model.Customer;
import com.train.integration.model.Product;

import org.springframework.http.ResponseEntity;

import com.train.integration.response.UtilResponse;
import org.springframework.http.HttpStatus;
import com.train.integration.generic.GenericController;
import com.train.integration.generic.GenericService;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController extends GenericController<Customer, Long> {

    public CustomerController( CustomerService service) {
        super(service);

    }
}