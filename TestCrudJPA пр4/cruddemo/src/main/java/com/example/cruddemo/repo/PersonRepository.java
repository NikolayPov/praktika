package com.example.cruddemo.repo;

import com.example.cruddemo.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
