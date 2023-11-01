package com.example.cruddemo.repo;

import com.example.cruddemo.models.Chashka;
import org.springframework.data.repository.CrudRepository;

public interface ChashkaRepository extends CrudRepository<Chashka, Long> {
    Chashka findByName(String name);
}
