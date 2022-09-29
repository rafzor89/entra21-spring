package com.sidcar.sidcar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name="fabricante")
public class Fabricante implements Serializable {
	/**
	 * 
	 */
	private static final long seialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique = true)
	private String nome;
	private String nacionalidade;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOrigem() {
		return nacionalidade;
	}
	public void setOrigem(String origem) {
		this.nacionalidade = origem;
	} 
	
	
	
}
