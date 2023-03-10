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
import com.example.demo.gr.cars.Marca;
import com.example.demo.gr.cars.Modelo;
import com.example.demo.repository.MarcaRepository;
import com.example.demo.repository.ModeloRepository;


@RestController
@RequestMapping("/modelo")
public class ModeloController {
	@Autowired
	ModeloRepository repository;
	@Autowired
	MarcaRepository	marca_repository;
	
	@GetMapping
	public List<Modelo> get_all_modelos(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Modelo get_modelos_by_id(@PathVariable Long id) {
		Optional<Modelo> modelo = repository.findById(id);
		return modelo.orElseThrow(() -> new ProductNotFoundException());
	}
	@PostMapping	
	public ResponseEntity<Object> saveModelo(@RequestBody Modelo modelo) {
	    List<Marca> marcas = marca_repository.findAll(); 
	    for (Marca marca : marcas) {
	        if(marca.id == modelo.getMarca_id()) {
	            repository.save(modelo);
	            return ResponseEntity.ok("Saved Successfully");
	        }
	    }
	    return new ResponseEntity<>("Marca inexistente", HttpStatus.BAD_REQUEST);
	}	
	@DeleteMapping("/{id}")
	public void delete_modelo(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
