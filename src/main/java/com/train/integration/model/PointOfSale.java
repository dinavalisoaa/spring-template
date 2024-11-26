package com.train.integration.model;


import java.util.Date;

import com.train.integration.generic.GenericModel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "point_of_sale")
public class PointOfSale extends  GenericModel  {
   

    private String name;
  

   
}
