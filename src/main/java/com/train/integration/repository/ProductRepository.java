package com.train.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.train.integration.model.Product;
import java.util.List;
import java.util.Optional;
import java.util.Date;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProductRepository extends JpaRepository<Product, Long> {

    //  public List<CashRegister> getAllByDateGreaterThanEqualAndShopIdAndPaymentTypeId(Timestamp date, Long shopId, Long paymentTypeId);

    // @Query("SELECT COALESCE(SUM(c.value * c.index),0) FROM CashRegister c WHERE c.date >= :date AND c.shopId = :shopId AND c.paymentTypeId = :paymentTypeId")
    // Double calculateSumOfCashRegisterWithCashReport(@Param("date") Timestamp date, @Param("shopId") Long shopId, @Param("paymentTypeId") Long paymentTypeId);

    // @Query("SELECT COALESCE(SUM(c.value * c.index),0) FROM CashRegister c WHERE c.shopId = :shopId AND c.paymentTypeId = :paymentTypeId")
    // Double  calculateSumOfCashRegisterWithoutCashReport( @Param("shopId") Long shopId, @Param("paymentTypeId") Long paymentTypeId);

    
//     @Query(nativeQuery = true, value = """
//    Select *from ....
//     """)
//     int calcSum(int sum);
}