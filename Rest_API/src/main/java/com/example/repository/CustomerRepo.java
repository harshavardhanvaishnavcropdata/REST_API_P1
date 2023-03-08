package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.CustomerEntity;

public interface CustomerRepo extends CrudRepository<CustomerEntity, Integer> {

}
