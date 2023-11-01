package com.example.cruddemo.repositories;

import com.example.cruddemo.models.ExecutionStage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExecutionStageRepository extends JpaRepository<ExecutionStage, Integer> {
}
