package com.sidcar.sidcar.model;

public class Modelo {
	private Long id;
	private Long id_fabricante;
	private String nome;
	private String cor;
	private Integer ano;
	private Integer quantPorta;
	
	private Fabricante fabricante;
	
	
	
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
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	
}
