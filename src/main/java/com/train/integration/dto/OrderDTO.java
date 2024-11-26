package com.train.integration.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private Long id;
    private Long customerId; 
    private String reference;
    private Date createdAt;
    private boolean checked;
}
