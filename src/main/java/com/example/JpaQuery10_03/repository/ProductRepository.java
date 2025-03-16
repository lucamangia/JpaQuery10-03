package com.example.JpaQuery10_03.repository;

import com.example.JpaQuery10_03.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByCategoryAndPriceLessThan(String category, Double price);
}
