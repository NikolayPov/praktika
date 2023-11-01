package com.example.cruddemo.repositories;

import com.example.cruddemo.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CarModelRepository extends JpaRepository<CarModel, Integer> {
}
