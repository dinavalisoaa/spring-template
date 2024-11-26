package com.train.integration.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryProductDTO {
    private Long id;
    private String categoryName;
    private String categoryDescription;
    private List<Long> productIds; 

}
