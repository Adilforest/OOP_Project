package com.example.FoodDelivery.services;

import com.example.FoodDelivery.entity.User;
import com.example.FoodDelivery.repositories.UserRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    private final UserRepositoryInterface repo;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    public List<User> getAll() {
        return repo.findAll();
    }
}

