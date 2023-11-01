package com.example.cruddemo.repo;

import com.example.cruddemo.models.Pasport;
import org.springframework.data.repository.CrudRepository;

public interface PasportRepository extends CrudRepository<Pasport, Long> {
    Pasport findByNumber(String number);
}
