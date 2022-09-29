package com.sidcar.sidcar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sidcar.sidcar.model.Fabricante;
import com.sidcar.sidcar.repository.FabricanteRepository;


@RestController
@RequestMapping(value = "/fabricante")
public class FabricanteController {
	
	@Autowired
	private FabricanteRepository fabricanteRepository;
	
	@PostMapping(value = "salvar")
	@ResponseBody
	public ResponseEntity<Fabricante>salvar(@RequestBody Fabricante f){
		Fabricante fabricante = fabricanteRepository.save(f);
		return new ResponseEntity<Fabricante>(fabricante, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "listatodos")
	@ResponseBody
	public ResponseEntity<List<Fabricante>>listaFabricante(){
		List<Fabricante> fabricante = fabricanteRepository.findAll();
		return new ResponseEntity<List<Fabricante>>(fabricante, HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "delete")
	@ResponseBody
	public ResponseEntity<String> delete(@RequestParam Long id){
		fabricanteRepository.deleteById(id);
		return new ResponseEntity<String>("Fabricante removido com sucesso.", HttpStatus.OK);
	}
	
	@GetMapping(value = "fabricanteID")
	@ResponseBody
	public ResponseEntity<Fabricante> fabricanteID(@RequestParam(name = "id") Long id){
		Fabricante f = fabricanteRepository.findById(id).get();
		return new ResponseEntity<Fabricante>(f,HttpStatus.OK);
		
	}
	
	@PutMapping(value = "atualizar")
	@ResponseBody
	public ResponseEntity<?> atualizar(@RequestBody Fabricante f){
		Fabricante fab = idExistente(f.getId());
		
		if(fab.getId( )== null) {
			return new ResponseEntity<String>("ID não localizado", HttpStatus.OK);
		}
		Fabricante fabricante = fabricanteRepository.saveAndFlush(f);
		return new ResponseEntity<Fabricante>(fabricante, HttpStatus.OK);		
	}
	
	public  Fabricante idExistente(Long id) {
		Fabricante f = fabricanteRepository.findById(id).get();
		return f;
	}
	
	@GetMapping(value = "pesquisarFabricanteNome")
	@ResponseBody
	public ResponseEntity<List<Fabricante>>buscarFabricanteNacionalidade(@RequestParam(name="nacionalidade") String nacionalidade){
		List<Fabricante> f = fabricanteRepository.findByNacionalidade(nacionalidade);
		return new ResponseEntity<List<Fabricante>>(f, HttpStatus.OK);
	}
}

