package org.example.cards;

import org.example.cards.dto.CarDTO;
import org.example.cards.service.CarManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarDsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarDsApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CarManager carManager){
        return args -> {
            List<CarDTO> cars = List.of(
                    CarDTO.builder().model("BMW").color("black").matricule("DDR3").price(1000000f).build(),
                    CarDTO.builder().model("Audi").color("green").matricule("DDR4").price(100000f).build(),
                    CarDTO.builder().model("Mercedes").color("black").matricule("DDR4").price(100000f).build(),
                    CarDTO.builder().model("Lamborghini").color("red").matricule("DDR5").price(100000f).build()
            );
            for(CarDTO carDTO : cars){
                carManager.saveCar(carDTO);
            }
        };
    }
}
