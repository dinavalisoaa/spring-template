package com.train.integration.generic;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Setter
@Getter
@MappedSuperclass
public class GenericModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
}
