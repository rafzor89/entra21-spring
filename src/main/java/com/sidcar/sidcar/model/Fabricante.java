package com.sidcar.sidcar.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Fabricante implements Serializable {
	/**
	 * 
	 */
	private static final long seialVersionUID = 1L;

	private Long id;
	private String nome;
	private String origem;
	
	
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
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	} 
	
	
	
}
