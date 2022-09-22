package com.sidcar.sidcar.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Modelo {
	
	private static final long seialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String nome;
	//@Column(name = "cor_fabricante", length = 200, nullable = false, unique = true)
	private String cor;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Fabricante")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Fabricante> fabricante;
	private Integer ano;
	private Integer quantPorta;
	

	
	
	
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
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getQuantPorta() {
		return quantPorta;
	}
	public void setQuantPorta(Integer quantPorta) {
		this.quantPorta = quantPorta;
	}
	public List<Fabricante> getFabricante() {
		return fabricante;
	}
	public void setFabricante(List<Fabricante> fabricante) {
		this.fabricante = fabricante;
	}

	
	
	
	
}
