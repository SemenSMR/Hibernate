package com.example.hibernate2;

import com.example.hibernate2.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
    @Query("SELECT o.productName FROM Orders o JOIN o.customer c WHERE LOWER(c.name) = LOWER(:name)")
    List<String> findByProductNameByCustomerNameIgnoreCase(String name);


}
