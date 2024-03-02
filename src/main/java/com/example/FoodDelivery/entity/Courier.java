package com.example.FoodDelivery.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Courier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "courier", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Order> orders = new HashSet<>();

    @Column(nullable = true)
    private Boolean isAvailable;

    public Courier(String name, String email, String phone, Boolean isAvailable) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.isAvailable = isAvailable;
    }
    public void addOrder(Order order) {
        orders.add(order);
        order.setCourier(this);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
        order.setCourier(null);
    }
}

