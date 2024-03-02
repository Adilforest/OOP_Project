package com.example.FoodDelivery.controllers;

import com.example.FoodDelivery.entity.User;
import com.example.FoodDelivery.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/")
    public List<User> getAll() {
        return service.getAll();
    }
}
