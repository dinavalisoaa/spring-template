package com.train.integration.model;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.train.integration.generic.GenericModel;

@Entity
@Getter
@Setter
@Table(name = "stock_move")
public class StockMove extends GenericModel {

    @ManyToOne
    Product productId;
    LocalDateTime dateMove;
    int unit;
    String moveType;
}
