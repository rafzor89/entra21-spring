package com.sidcar.sidcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sidcar.sidcar.model.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
	
}

