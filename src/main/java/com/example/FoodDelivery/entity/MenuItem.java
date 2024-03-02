package com.example.FoodDelivery.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
import java.util.HashSet;


@Entity
@Data
@Table(name = "menu_items")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurants restaurant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private MenuItem parentMenuItem;

    @OneToMany(mappedBy = "parentMenuItem", cascade = CascadeType.ALL)
    private Set<MenuItem> childMenuItems = new HashSet<>();
}
