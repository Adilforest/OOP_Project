package com.example.FoodDelivery.repositories;

import com.example.FoodDelivery.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Long> {
}
