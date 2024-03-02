package com.example.FoodDelivery.repositories;

import com.example.FoodDelivery.entity.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<Courier, Long> {

}
