package com.example.cruddemo.repositories;

import com.example.cruddemo.models.Service;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ServiceRepository extends JpaRepository<Service, Integer>  {
}
