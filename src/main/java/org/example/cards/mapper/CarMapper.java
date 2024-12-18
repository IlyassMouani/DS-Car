package org.example.cards.mapper;

import org.example.cards.dao.entities.Car;
import org.example.cards.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper mapper = new ModelMapper();


    public Car fromCarDTOToCar(CarDTO CarDto){
        return mapper.map(CarDto, Car.class);
    }

    public CarDTO fromCarToCarDTO(Car Car){
        return mapper.map(Car, CarDTO.class);
    }

}