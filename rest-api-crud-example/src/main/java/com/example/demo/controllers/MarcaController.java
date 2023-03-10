package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.exceptionhandler.ProductNotFoundException;
import com.example.demo.gr.cars.Marca;
import com.example.demo.repository.MarcaRepository;

@RestController
@RequestMapping("/marca")
public class MarcaController {
	@Autowired
	MarcaRepository repository;
	
	@GetMapping
	public List<Marca> get_all_marcas(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Marca get_marca_by_id(@PathVariable Long id) {
		Optional<Marca> marca = repository.findById(id);
		return marca.orElseThrow(() -> new ProductNotFoundException());
	}
	
	@PostMapping
	public Marca save_marca(@RequestBody Marca marca) {
		return repository.save(marca);
	}
	
	@DeleteMapping("/{id}")
	public void delete_marca(@PathVariable Long id) {
		repository.deleteById(id);
		
	}
}


