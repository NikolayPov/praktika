package com.example.cruddemo.repositories;

import com.example.cruddemo.models.Product;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Integer>{
}
