package com.train.integration.model;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "author")
public class Author  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    private String email;

    private String contact;

    private Date birthdate;

    private String password;

    private String key;
   
}
