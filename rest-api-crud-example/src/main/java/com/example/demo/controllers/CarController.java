package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptionhandler.ProductNotFoundException;
import com.example.demo.gr.cars.Car;
import com.example.demo.gr.cars.Modelo;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.ModeloRepository;

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	CarRepository repository;
	@Autowired
	ModeloRepository modelo_repository;
	
	@GetMapping
	public List<Car> get_all_cars(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Car get_car_by_id(@PathVariable Long id) {
		Optional<Car> car = repository.findById(id);
		return car.orElseThrow(() -> new ProductNotFoundException());
	}
	@PostMapping	
	public ResponseEntity<Object> save_car(@RequestBody Car car) {
	    List<Modelo> modelos = modelo_repository.findAll(); 
	    for (Modelo modelo : modelos) {
	        if(modelo.id == car.getModelo_id()){
	            repository.save(car);
	            return ResponseEntity.ok("Saved Successfully");
	        }
	    }
	    return new ResponseEntity<>("Marca inexistente", HttpStatus.BAD_REQUEST);
	}	
	
	@DeleteMapping("/{id}")
	public void delete_car(@PathVariable Long id) {
		repository.deleteById(id);
	}
}


