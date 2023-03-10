package com.example.demo.gr.cars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Modelo{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	@Column(nullable = false)
	private int marca_id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private int valor_fipe;
		
		public Modelo() {}
		public Modelo(int marca_id, String nome, int valor_fipe) {
			super();
			this.marca_id = marca_id;
			this.nome = nome;
			this.valor_fipe = valor_fipe;
		}

		public Long getId() {
			return id;
		}
		public int getMarca_id() {
			return marca_id;
		}
		public void setMarca_id(int marca_id) {
			this.marca_id = marca_id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getValor_fipe() {
			return valor_fipe;
		}
		public void setValor_fipe(int valor_fipe) {
			this.valor_fipe = valor_fipe;
		}
		
}
