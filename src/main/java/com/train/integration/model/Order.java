package com.train.integration.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.train.integration.generic.GenericModel;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order extends GenericModel {
  

    @ManyToOne
    Customer customer;

    String reference;
    Date createAt;
    boolean checked;

    // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
    // @JsonIgnore
    // private List<OrderLine> productList = new ArrayList<>();
}
