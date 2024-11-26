package com.train.integration.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO  {
  
    private String firstName;
    private String lastName;
    private String email;
    
    private Long genderId;
    private String contact;

    private Date birthdate;

    private String password;

    private String key;
   
}
