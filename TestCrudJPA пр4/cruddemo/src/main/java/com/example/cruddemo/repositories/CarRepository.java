package com.example.cruddemo.repositories;

import com.example.cruddemo.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
