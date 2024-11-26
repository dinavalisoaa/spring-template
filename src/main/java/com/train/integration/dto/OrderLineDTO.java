package com.train.integration.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderLineDTO {
    private Long id;
    private String imageUrl;
    private BigDecimal price;
    private int quantity;
    private Long productId; 
    private Long orderId;   
}
