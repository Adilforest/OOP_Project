package com.example.FoodDelivery.repositories;

import com.example.FoodDelivery.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT o FROM Order o JOIN FETCH o.orderItems WHERE o.id = :orderId")
    Order findOrderWithItems(Long orderId);
}
