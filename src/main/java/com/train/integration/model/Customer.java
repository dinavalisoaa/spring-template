package com.train.integration.model;


import java.util.Date;

import com.train.integration.generic.GenericModel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customer")
public class Customer extends  GenericModel  {
   

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "gender_id", referencedColumnName = "id")
    private Gender gender;

    private Date birthdate;

    private String password;

   
}
