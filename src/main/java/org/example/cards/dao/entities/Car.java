package org.example.cards.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id_Car;
    private String model;
    private String color;
    private String matricule;
    private Float price;
}
