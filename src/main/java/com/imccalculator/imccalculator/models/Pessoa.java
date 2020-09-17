package com.imccalculator.imccalculator.models;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "TB_PESSOA")
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	private String cpf;
	
	private String classificação;
	
	private BigDecimal peso;
	
	private BigDecimal altura;
	
	private BigDecimal calculoImc;
	
	private LocalDate data;
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getClassificação() {
		return classificação;
	}

	public void setClassificação(String classificação) {
		this.classificação = classificação;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getCalculoImc() {
		return calculoImc;
	}

	public void setCalculoImc(BigDecimal calculoImc) {
		this.calculoImc = calculoImc;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
	
	

}
