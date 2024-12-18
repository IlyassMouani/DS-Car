package org.example.cards.service;

import org.example.cards.dao.entities.Car;
import org.example.cards.dto.CarDTO;
import java.util.List;


public interface CarService {

    CarDTO saveCar(CarDTO carDTO);
    List<CarDTO> getCarByModel(String model);
}
