package com.example.demo.gr.cars;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
@Entity
@Data
public class Car{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@CreationTimestamp
	@Column
	private Date timestamp_cadastro;
	@Column(nullable = false)
	private Long modelo_id;
	@Column(nullable = false)
	private int ano;
	@Column(nullable = false)
	private String combustivel;
	@Column(nullable = false)
	private int num_portas;
	@Column(nullable = false)
	private String cor;
	
	public Car() {}
	public Car(Long modelo_id, int ano, String combustivel, int num_portas, String cor) {
		this.timestamp_cadastro = new Date();
		this.modelo_id = modelo_id;
		this.ano = ano;
		this.combustivel = combustivel;
		this.num_portas = num_portas;
		this.cor = cor;
	}
	public Long getId() {
		return id;
	}
	public java.util.Date getTimestamp_cadastro() {
		return timestamp_cadastro;
	}
	public Long getModelo_id() {
		return modelo_id;
	}
	public void setModelo_id(Long modelo_id) {
		this.modelo_id = modelo_id;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getNum_portas() {
		return num_portas;
	}
	public void setNum_portas(int num_portas) {
		this.num_portas = num_portas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
		
}
