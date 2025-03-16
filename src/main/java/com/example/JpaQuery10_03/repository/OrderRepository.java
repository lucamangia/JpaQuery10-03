package com.example.JpaQuery10_03.repository;

import com.example.JpaQuery10_03.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findByCustomerName(String customerName);
}
