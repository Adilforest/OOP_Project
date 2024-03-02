package com.example.FoodDelivery.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@Table(name = "restaurants")
public class Restaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String workingHours;

    @Column
    private Double rating;

    @Column
    private String imageUrl;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MenuItem> menuItems;

    public Restaurants(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
