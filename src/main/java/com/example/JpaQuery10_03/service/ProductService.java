package com.example.JpaQuery10_03.service;

import com.example.JpaQuery10_03.entity.Product;
import com.example.JpaQuery10_03.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct (Product product){
        return productRepository.save(product);
    }

    public Optional<Product> findProductById(Long id){
        return productRepository.findById(id);
    }
    //List<Product> findByCategoryAndPriceLessThan(String category, Double price);
    //select * from prodotti where category = casa and prezzo = 10;
    public List<Product> findByCategoryAndPriceLessThan(String category, Double price){
        return productRepository.findByCategoryAndPriceLessThan(category,price);
    }









}
