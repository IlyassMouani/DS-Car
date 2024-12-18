package org.example.cards.dao.repositories;

import org.example.cards.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, String> {
    List<Car> getByModel(String model);
}
