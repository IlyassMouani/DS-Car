package org.example.cards.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CarDTO {
    private String model;
    private String color;
    private String matricule;
    private Float price;
}
