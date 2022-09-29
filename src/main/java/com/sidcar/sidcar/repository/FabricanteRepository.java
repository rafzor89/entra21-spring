package com.sidcar.sidcar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sidcar.sidcar.model.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
	
	@Query(value = "select f from Fabricante f where f.nome = ?1")
	List<Fabricante> findByNacionalidade(String nacionalidade);
	

}

