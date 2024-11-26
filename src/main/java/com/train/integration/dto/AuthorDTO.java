package com.train.integration.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Getter
@Setter
public class AuthorDTO {
  public  String contact,email,firstName,key,password,lastName;
  public  Date birthdate;
}
