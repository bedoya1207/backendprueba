package com.evaluacion.empresa.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluacion.empresa.prueba.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
	
	
	
}
