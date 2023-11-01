package com.example.cruddemo.repositories;

import com.example.cruddemo.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository  extends JpaRepository<Orders, Integer> {
}
