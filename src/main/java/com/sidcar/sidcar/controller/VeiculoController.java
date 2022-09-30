package com.sidcar.sidcar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sidcar.sidcar.model.Veiculo;
import com.sidcar.sidcar.repository.VeiculoRepository;

@RestController
@RequestMapping(value="/veiculo")
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@PostMapping(value = "salvar")
	@ResponseBody
	public ResponseEntity<Veiculo> salvar(@RequestBody Veiculo v){
		Veiculo veiculo = veiculoRepository.save(v);
		return new ResponseEntity<Veiculo>(veiculo, HttpStatus.CREATED);
	}
	
	@GetMapping(value="listaVeiculo")
	@ResponseBody
	public ResponseEntity<List<Veiculo>>listaVeiculo(){
		List<Veiculo> veiculo = veiculoRepository.findAll();
		return new ResponseEntity<List<Veiculo>>(veiculo, HttpStatus.OK);
	}
}
