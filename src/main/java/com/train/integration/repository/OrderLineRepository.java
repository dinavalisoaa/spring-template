package com.train.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.train.integration.model.OrderLine;
import java.util.List;
import java.util.Optional;
import java.util.Date;


public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

}