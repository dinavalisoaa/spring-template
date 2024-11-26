package com.train.integration.model;

import java.util.ArrayList;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.train.integration.generic.GenericModel;

@Entity
@Getter
@Setter
@Table(name = "category_product")
public class CategoryProduct extends GenericModel {

    private String categoryName;

    private String categoryDescription;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "productCategory")
    @JsonIgnore
    private List<Product> productList = new ArrayList<>();

    public void setCategoryName(String categoryName){
        if (categoryName == null || categoryName.isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide.");
        }
        this.categoryName = categoryName;
    }
}
