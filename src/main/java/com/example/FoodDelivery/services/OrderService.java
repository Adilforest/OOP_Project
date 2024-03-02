package com.example.FoodDelivery.services;

import com.example.FoodDelivery.entity.Order;
import com.example.FoodDelivery.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Optional<Order> getOrderWithDetails(Long orderId) {
        return orderRepository.findById(orderId);
    }
}
