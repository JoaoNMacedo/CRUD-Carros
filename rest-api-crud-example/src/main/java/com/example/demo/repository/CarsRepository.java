package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.gr.cars.Cars;

public interface CarsRepository extends JpaRepository<Cars, Long> {

}
