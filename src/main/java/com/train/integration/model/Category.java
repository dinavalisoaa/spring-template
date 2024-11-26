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
@Table(name = "category")
public class Category extends GenericModel {

    private String name;

    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
    @JsonIgnore
    private List<Product> productList = new ArrayList<>();

    public void setName(String categoryName){
        if (categoryName == null || categoryName.isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide.");
        }
        this.name = categoryName;
    }
}
