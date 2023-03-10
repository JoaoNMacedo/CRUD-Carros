package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.gr.cars.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long>{

}
