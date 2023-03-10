package com.example.demo.gr.cars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	@Column(nullable = false)
	private String nome_marca;
	
	
	public Marca() {
		
	}
	public Marca(String nome_marca) {
		super();
		this.nome_marca = nome_marca;
	}
	public Long getId() {
		return id;
	}
	public String getNome_marca() {
		return nome_marca;
	}
	public void setNome_marca(String nome_marca) {
		this.nome_marca = nome_marca;
	}
	
}
