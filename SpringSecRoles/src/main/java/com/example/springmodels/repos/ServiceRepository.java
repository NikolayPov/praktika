package com.example.springmodels.repos;

import com.example.springmodels.models.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Integer>  {



}
