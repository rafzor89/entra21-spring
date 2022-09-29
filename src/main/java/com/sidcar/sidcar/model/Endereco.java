package com.sidcar.sidcar.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String cep;
	private int numero;
	private String complemento;
	
	public Endereco() {
		super();
	}
	public Endereco(Long id, String cep, int numero, String complemento) {
		super();
		this.id = id;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	@Override
	public String toString() {
		return "Endereco [id=" + id + ", cep=" + cep + ", numero=" + numero + ", complemento=" + complemento + "]";
	}
	
	
}
