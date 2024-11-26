package com.train.integration.model;

import com.train.integration.generic.GenericModel;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

// import org.hibernate.annotations.CreationTimestamp;
// import org.hibernate.annotations.UpdateTimestamp;    

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "product")
public class Product  extends GenericModel {
    

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String description;

    private BigDecimal basePrice;


    // @CreationTimestamp
    // private LocalDateTime creationTime;

    // @UpdateTimestamp
    // private LocalDateTime lastUpdated;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CategoryProduct productCategory;
}
