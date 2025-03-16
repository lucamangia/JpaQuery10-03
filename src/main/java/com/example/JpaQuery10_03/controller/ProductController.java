package com.example.JpaQuery10_03.controller;

import com.example.JpaQuery10_03.entity.Product;
import com.example.JpaQuery10_03.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct (@RequestBody Product product){
        Product createdProduct = productService.createProduct(product);
        return ResponseEntity.ok(createdProduct);
    }

    @GetMapping("/find-by-id/{id}")
    private ResponseEntity<Product> findProductById (@PathVariable Long id){

        Optional<Product> optionalProduct = productService.findProductById(id);
        if (optionalProduct.isPresent()){
            return ResponseEntity.ok(optionalProduct.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/find-By-Category-And-Price-Less-Than/{category}/{price}")
    private ResponseEntity<List<Product>> findByCategoryAndPriceLessThan(@PathVariable String category,
                                                                         @PathVariable Double price){

        List<Product> productList = productService.findByCategoryAndPriceLessThan(category,price);
        return ResponseEntity.ok(productList);
    }
}
