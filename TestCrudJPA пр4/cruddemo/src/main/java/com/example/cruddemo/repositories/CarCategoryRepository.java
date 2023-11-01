package com.example.cruddemo.repositories;

import com.example.cruddemo.models.CarCategory;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CarCategoryRepository extends JpaRepository<CarCategory, Integer>{

}
