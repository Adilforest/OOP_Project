package com.example.FoodDelivery.initializer;

import com.example.FoodDelivery.entity.Courier;
import com.example.FoodDelivery.repositories.CourierRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor

public class CourierInit {
    private final CourierRepository courierRepository;

    @PostConstruct
    public void init() {
        if (courierRepository.count() == 0) {
            Courier courier1 = Courier.builder()
                    .name("Adil")
                    .email("forest@kek.com")
                    .phone("88005553535")
                    .isAvailable(true)
                    .build();
            Courier courier2 = Courier.builder()
                    .name("Bera")
                    .email("Bera@kek.com")
                    .phone("88005553534")
                    .isAvailable(true)
                    .build();
            courierRepository.saveAll(Arrays.asList(courier1, courier2));
        }
    }
}
