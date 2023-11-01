package com.example.cruddemo.repo;

import com.example.cruddemo.models.Drink;
import org.springframework.data.repository.CrudRepository;

public interface DrinkRepository extends CrudRepository<Drink, Long> {
    Drink findByName(String name);
}
