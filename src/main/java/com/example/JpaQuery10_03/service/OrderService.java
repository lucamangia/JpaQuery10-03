package com.example.JpaQuery10_03.service;

import com.example.JpaQuery10_03.entity.Order;
import com.example.JpaQuery10_03.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public Optional<Order> findById(Long orderId){
        return orderRepository.findById(orderId);
    }

    public List<Order> findByCustomerName(String customerName){
        return orderRepository.findByCustomerName(customerName);
    }







}
