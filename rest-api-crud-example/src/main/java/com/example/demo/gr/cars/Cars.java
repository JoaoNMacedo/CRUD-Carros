package com.example.demo.gr.cars;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cars {
	@Id
	@Column(nullable = false)
	private Long id;
	@Column(nullable = false)
	private Long marca_id;
	@Column(nullable = false)
	private String marca_nome;
	@Column(nullable = false)
	private String nome_modelo;
	@Column(nullable = false)
	private int ano;
	@Column(nullable = false)
	private String combustivel;
	@Column(nullable = false)
	private int num_portas;
	@Column(nullable = false)
	private int valor_fipe;
	@Column(nullable = false)
	private String cor;
	@Column(nullable = false)
	private Date timestamp_cadastro;
	
	
	public Cars(Car car) {}
	
	
	public Cars(Long id, Long marca_id, String marca_nome, String nome_modelo, int ano, String combustivel,
			int num_portas, int valor_fipe, String cor, Date timestamp_cadastro) {
		this.id = id;
		this.marca_id = marca_id;
		this.marca_nome = marca_nome;
		this.nome_modelo = nome_modelo;
		this.ano = ano;
		this.combustivel = combustivel;
		this.num_portas = num_portas;
		this.valor_fipe = valor_fipe;
		this.cor = cor;
		this.timestamp_cadastro = timestamp_cadastro;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getMarca_id() {
		return marca_id;
	}


	public void setMarca_id(Long marca_id) {
		this.marca_id = marca_id;
	}


	public String getMarca_nome() {
		return marca_nome;
	}


	public void setMarca_nome(String marca_nome) {
		this.marca_nome = marca_nome;
	}


	public String getNome_modelo() {
		return nome_modelo;
	}


	public void setNome_modelo(String nome_modelo) {
		this.nome_modelo = nome_modelo;
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


	public int getValor_fipe() {
		return valor_fipe;
	}


	public void setValor_fipe(int valor_fipe) {
		this.valor_fipe = valor_fipe;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Date getTimestamp_cadastro() {
		return timestamp_cadastro;
	}


	public void setTimestamp_cadastro(Date timestamp_cadastro) {
		this.timestamp_cadastro = timestamp_cadastro;
	}


	
	

	
}
