package com.imccalculator.imccalculator.models;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "TBL_PESSOA_NEW")
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1l;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	private String cpf;
	
	private String classificação;
	
	private Double peso;
	
	private Double altura;
	
	private Double calculoImc;
	
	
	@Temporal(TemporalType.DATE)
	private Date createdDate = new Date(System.currentTimeMillis());
	
	
	public Pessoa() {
		
	}
	
	

	public Pessoa(long id, String nome, String cpf, String classificação, Double peso, Double altura,
			Double calculoImc, Date createdDate) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.classificação = classificação;
		this.peso = peso;
		this.altura = altura;
		this.calculoImc = calculoImc;
		this.createdDate = createdDate;
	}


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
		String classi ="";
		
		Double soma = altura/100;
		calculoImc = (peso/(soma*soma));
		
		if(calculoImc>=18) {
			 classi = "Normal";
		}else if(calculoImc<=18) {
			 classi = "Anormal";
		}
		    classificação = classi;
		    return classificação;
	}
	
	

	public void setClassificação(String classificação) {

		this.classificação = classificação;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getCalculoImc() {
		Double soma = altura/100;
		calculoImc = (peso/(soma*soma));
		return calculoImc;
	}

	
	public void setCalculoImc(Double calculoImc) {
		this.calculoImc = calculoImc;
	}


	public Date getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	

}
