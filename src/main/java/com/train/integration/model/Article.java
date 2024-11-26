package com.train.integration.model;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.ManyToOne;


@Entity
@Getter
@Setter
@Table(name = "article")
public class Article  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    Author author;
    String text;
    Date publishAt;
}
