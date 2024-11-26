package com.train.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.train.integration.model.StockMove;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StockMoveRepository extends JpaRepository<StockMove, Long> {

}