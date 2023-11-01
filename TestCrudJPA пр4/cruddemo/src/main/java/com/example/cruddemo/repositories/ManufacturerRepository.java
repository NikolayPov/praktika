package com.example.cruddemo.repositories;

import com.example.cruddemo.models.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer>{

}
