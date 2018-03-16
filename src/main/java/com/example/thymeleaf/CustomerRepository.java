package com.example.thymeleaf;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}//Close StudentRepository interface.
