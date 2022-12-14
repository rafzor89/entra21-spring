package com.sidcar.sidcar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sidcar.sidcar.model.Fabricante;
import com.sidcar.sidcar.model.Veiculo;

@RequestMapping(value="/ola", method = RequestMethod.GET)
@RestController
public class OlaController {
	
	@RequestMapping(value="/mundo", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String ola() {
		return "Olá";
	}
	
	@RequestMapping(value = "/mundo/{nome}", method = RequestMethod.GET)
	public String OlaPessoa(@PathVariable String nome) {
		return "Olá " + nome;
	}
	
	@RequestMapping(value = "mundo/fabricante", method = RequestMethod.GET)
	public Fabricante fabricante(Fabricante f) {
		f.setId((long)1);
		f.setNome("AUDI");
		f.setOrigem("Alemanha");
				
		return f;
	}
	
	@RequestMapping(value = "/mundo/modelo", method = RequestMethod.GET)
	public Veiculo modelo(Veiculo m, Fabricante f) {
		m.setId((long)1);
		m.setNome("Fusca");
		m.setCor("Preto");
		m.setAnoModelo(1969);
		m.setAnoFabricacao(1968);
		f.setNome("Volkswagem");
		f.setOrigem("Alemanha");
						
		return m;
	}
	
}
