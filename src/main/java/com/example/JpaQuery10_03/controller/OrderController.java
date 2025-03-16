package com.example.JpaQuery10_03.controller;

import com.example.JpaQuery10_03.entity.Order;
import com.example.JpaQuery10_03.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        return ResponseEntity.ok(order);
    }

    @GetMapping("/find-order-by-id/{id}")
    public ResponseEntity<Order> findOrderById(@PathVariable Long orderId) {

        Optional<Order> currentOrder = orderService.findById(orderId);
        if (currentOrder.isPresent()) {
            return ResponseEntity.ok(currentOrder.get());
        }
        return ResponseEntity.notFound().build();
    }
    //public List<Order> findByCustomerName(String customerName){
    @GetMapping("/find-By-Customer-Name/{customerName}")
    public List<Order> findByCustomerName(@PathVariable String customerName){
        return orderService.findByCustomerName(customerName);
    }
}
