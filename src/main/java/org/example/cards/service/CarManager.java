package org.example.cards.service;

import lombok.AllArgsConstructor;
import org.example.cards.dao.entities.Car;
import org.example.cards.dao.repositories.CarRepository;
import org.example.cards.dto.CarDTO;
import org.example.cards.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService{
    CarMapper carMapper;
    CarRepository carRepository;

    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        return carMapper.fromCarToCarDTO(
                carRepository.save(
                        carMapper.fromCarDTOToCar(carDTO)
                )
        );
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<CarDTO> CarsDTO = new ArrayList<>();
        List<Car> Cars = carRepository.getByModel(model);
        for(Car car:Cars){
            CarsDTO.add(carMapper.fromCarToCarDTO(car));
        }
        return CarsDTO;
    }
}



